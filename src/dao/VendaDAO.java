package dao;

import Classes.Cliente;
import Classes.Produto;
import Classes.Venda;
import Classes.VendaProduto;
import Conexao.Conexao;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.sql.ResultSet;
import java.util.List;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class VendaDAO {
    
    Conexao conexao;
    Connection conn;

    public VendaDAO() {
        conexao = new Conexao();
        conn = conexao.getConexao();
    }
    
    public void cadastrarVenda(Venda v) {

        try {

            String sql = "INSERT INTO Venda (quantidade,valorVenda,dataVenda,dataPagamento,cliente_id,NaoCliente,status) VALUES (?,?,?,?,?,?,?)";

            PreparedStatement stm = this.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stm.setInt(1, v.getQuantidade());
            stm.setDouble(2, v.getValorVenda());
            DateFormat df = DateFormat.getDateInstance();

            stm.setDate(3, new java.sql.Date(v.getDataVenda().getTimeInMillis()));
            stm.setDate(4, new java.sql.Date(v.getDataPagamento().getTimeInMillis()));

            stm.setInt(5, v.getCliente().getId());
            stm.setString(6, v.getNaoCliente());
            stm.setBoolean(7, v.isStatus());
            stm.execute();

            ResultSet rs = stm.getGeneratedKeys();
            if (rs.next()) {
                int vendaId = rs.getInt(1);

                String sqlVendaProduto = "INSERT INTO produtoVenda (venda_id,produto_id,quantidade) values (?,?,?)";
                PreparedStatement stmVendaProduto = this.conn.prepareStatement(sqlVendaProduto, Statement.RETURN_GENERATED_KEYS);
                List<VendaProduto> produtosVenda = v.getProdutoVenda();

                for (VendaProduto p : produtosVenda) {
                    stmVendaProduto.setInt(1, vendaId);
                    stmVendaProduto.setInt(2, p.getProduto().getId());
                    stmVendaProduto.setInt(3, p.getQuantidade());
                    stmVendaProduto.addBatch();
                }

                stmVendaProduto.executeBatch();
                stmVendaProduto.close();

                for (VendaProduto p : v.getProdutoVenda()) {
                    int produtoId = p.getProduto().getId();
                    int quantidadeVendida = p.getQuantidade();

                    String sqlAtualizar = "UPDATE Produto SET quantidade = quantidade - ? WHERE id = ?";
                    PreparedStatement state = this.conn.prepareStatement(sqlAtualizar);
                    state.setInt(1, quantidadeVendida);
                    state.setInt(2, produtoId);
                    state.executeUpdate();
                    state.close();
                }

            } else {
                throw new SQLException("erro ao gerar o id do vendaProduto");
            }

            rs.close();
            stm.close();

        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar venda " + e.getMessage());
        }

    }
    
    
    public Venda vendaId(int id){
        
        
        try{
             String sql = "SELECT * FROM venda WHERE id = ?";
             PreparedStatement ps = this.conn.prepareCall(sql);
             ps.setInt(1, id);
             
             
             ResultSet rs = ps.executeQuery();
             while(rs.next()){
                 
                 Venda v = new Venda();
                 v.setId(rs.getInt("id"));
                 v.setQuantidade(rs.getInt("quantidade"));
                 return v;
                 
             }
             
            ps.close();
            rs.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
      
            
        return null;
       
     
    }
    
    public List<Venda> listar() {
        List<Venda> listaVenda = new ArrayList();
        try {

            String sql = "SELECT v.id,v.quantidade,v.valorVenda,v.dataVenda,v.dataPagamento,c.id,c.nome,c.telefone,v.naoCliente,v.status,p.nome,pv.venda_id,pv.produto_id,pv.quantidade "
                    + "FROM venda v "
                    + "JOIN cliente c ON v.cliente_id = c.id "
                    + "JOIN produtovenda pv ON pv.venda_id = v.id "
                    + "JOIN produto p on pv.produto_id = p.id";

            PreparedStatement stm = this.conn.prepareCall(sql);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                Venda v = new Venda();
                v.setId(rs.getInt("v.id"));
                v.setQuantidade(rs.getInt("v.quantidade"));
                v.setValorVenda(rs.getDouble("valorVenda"));
                
                Date dataVenda = rs.getDate("v.dataVenda");
                Calendar c = Calendar.getInstance();
                c.setTime(dataVenda);
                v.setDataVenda(c);
                
                Date dataPagamento = rs.getDate("v.dataPagamento");
                Calendar ca = Calendar.getInstance();
                ca.setTime(dataPagamento);
                v.setDataPagamento(ca);

                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("c.id"));
                cliente.setNome(rs.getString("c.nome"));
                cliente.setTelefone(rs.getInt("c.telefone"));
                v.setCliente(cliente);
                

                v.setNaoCliente(rs.getString("v.naoCliente"));
                v.setStatus(rs.getBoolean("v.status"));

                VendaProduto vP = new VendaProduto();

            
                int produtoId = rs.getInt("pv.produto_id");
              
                if(produtoId != 0){
                Produto p = new Produto();
                p.setId(produtoId);
                    
                p.setNome(rs.getString("p.nome"));
                    
                vP.setProduto(p);
                vP.setQuantidade(rs.getInt("pv.quantidade"));
                    
                }

                List<VendaProduto> listaProdutosVenda = v.getProdutoVenda();
                if (listaProdutosVenda == null) {
                    listaProdutosVenda = new ArrayList();
                    v.setProdutoVenda(listaProdutosVenda);
                }
                listaProdutosVenda.add(vP);

                boolean vendaExiste = false;
                for (Venda ve : listaVenda) {
                    if (ve.getId() == v.getId()) {
                        ve.getProdutoVenda().add(vP);
                        vendaExiste = true;
                        break;
                    }
                }

                if (!vendaExiste) {
                    listaVenda.add(v);
                }         

            }
            
            stm.close();
            rs.close();
            
        } catch(SQLException e) {
            e.printStackTrace();
        }   
         return listaVenda;
    }  
    
    public void deletar(int id){
        
        try{
            String sql ="DELETE FROM Venda WHERE id = ?";
            PreparedStatement stm = this.conn.prepareStatement(sql);
            stm.setInt(1, id);
            stm.execute();
            
            stm.close();
        }catch(SQLException e){
            
            System.out.println("Erro ao deletar " +e.getMessage());
        }
    }

}