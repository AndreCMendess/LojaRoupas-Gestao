package dao;

import Classes.Produto;
import Classes.Venda;
import Classes.VendaProduto;
import Conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;

public class ProdutoDAO {

    private Conexao conexao;
    private Connection conn;

    public ProdutoDAO() {

        conexao = new Conexao();
        conn = conexao.getConexao();

    }

    public void cadastrarProduto(Produto p) {

        try {
            String sql = "INSERT INTO Produto (nome,descricao,tamanho,valorCompra,valorVenda,quantidade) VALUES (?,?,?,?,?,?)";

            PreparedStatement stm = this.conn.prepareStatement(sql);

            stm.setString(1, p.getNome());
            stm.setString(2, p.getDescricao());
            stm.setString(3, p.getTamanho());
            stm.setDouble(4, p.getValorCompra());
            stm.setDouble(5, p.getValorVenda());
            stm.setInt(6, p.getQuantidade());
            stm.execute();
            
            stm.close();
       
            

        } catch (Exception e) {
            System.out.println("Erro ao cadastrar produto no banco de dados" + e.getMessage());
        }
    }

    public void deletarProduto(int id) {

        try {

            String sql = "DELETE FROM Produto WHERE id = ?";

            PreparedStatement stm = this.conn.prepareStatement(sql);

            stm.setInt(1, id);
            stm.execute();
            
            stm.close();
           
            

        } catch (Exception e) {
            System.out.println("Erro ao excluir o produto" + e.getMessage());
        }
        
       

    }

    public List<Produto> listar() {

        try {

            String sql = "SELECT * FROM Produto";

            PreparedStatement stm = this.conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            List<Produto> lista = new ArrayList<>();

            while (rs.next()) {
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setDescricao(rs.getString("descricao"));
                p.setTamanho(rs.getString("tamanho"));
                p.setValorCompra(rs.getDouble("valorCompra"));
                p.setValorVenda(rs.getDouble("valorVenda"));
                p.setQuantidade(rs.getInt("quantidade"));
                lista.add(p);
            }

            
            stm.close();
            rs.close();
            
            return lista;

        } catch (Exception e) {
            System.out.println("erro ao receber lista de produtos do banco de dados " + e.getMessage());
            return null;
        }
    }

    public void atualizarProduto(Produto p, int id) {

        try {

            String sql = "UPDATE Produto SET nome = ?, descricao = ?, tamanho = ?, valorCompra = ?, valorVenda = ?, quantidade = ? WHERE id = ?";

            PreparedStatement stm = this.conn.prepareStatement(sql);
            stm.setString(1, p.getNome());
            stm.setString(2, p.getDescricao());
            stm.setString(3, p.getTamanho());
            stm.setDouble(4, p.getValorCompra());
            stm.setDouble(5, p.getValorVenda());
            stm.setInt(6, p.getQuantidade());
            stm.setInt(7, id);
            stm.execute();

            
            stm.close();
         
            
        } catch (Exception e) {
            System.out.println("Erro ao atualizar o produto \n" + e.getMessage());
        }

    }

    public List<Produto> pesquisarPorValor(Double valor1, Double valor2) {

        try {
            String sql = "SELECT * FROM Produto WHERE valorVenda  BETWEEN ? AND ?";

            PreparedStatement stm = this.conn.prepareStatement(sql);
            stm.setDouble(1, valor1);
            stm.setDouble(2, valor2);
            ResultSet rs = stm.executeQuery();

            List<Produto> lista = new ArrayList();

            while (rs.next()) {
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setDescricao(rs.getString("descricao"));
                p.setTamanho(rs.getString("tamanho"));
                p.setValorCompra(rs.getDouble("valorCompra"));
                p.setValorVenda(rs.getDouble("valorVenda"));
                p.setQuantidade(rs.getInt("quantidade"));
                lista.add(p);
            }

            stm.close();
            rs.close();
            
            return lista;

        } catch (Exception e) {
            System.out.println("Erro de retorno de tabela filtrada por valor " + e.getMessage());
            return null;
        }

    }

    public List<Produto> pesquisar(String filtro, String pesquisa) {

        List<String> filtros = Arrays.asList("Nome", "Descricao", "Tamanho", "Quantidade");

        if (!filtros.contains(filtro)) {
            throw new IllegalArgumentException("tipo invalido para filtrar " + filtro);
        }

        try {

            String sql = "SELECT * FROM Produto WHERE " + filtro + " LIKE ?";

            PreparedStatement stm = this.conn.prepareStatement(sql);

            stm.setString(1, "%" + pesquisa + "%");

            ResultSet rs = stm.executeQuery();

            List<Produto> lista = new ArrayList();

            while (rs.next()) {
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setDescricao(rs.getString("descricao"));
                p.setTamanho(rs.getString("tamanho"));
                p.setValorCompra(rs.getDouble("valorCompra"));
                p.setValorVenda(rs.getDouble("valorVenda"));
                p.setQuantidade(rs.getInt("quantidade"));
                lista.add(p);
            }

            stm.close();
            rs.close();
            
            return lista;
        } catch (Exception e) {
            System.out.println("Erro ao retornar lista filtrada " + e.getMessage());
            return null;
        }
    }
    
    
    public Produto produtoId(int id){
        
        String sql = "select * from produto where id = ?";
        
        try{
            
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setValorVenda(rs.getDouble("valorVenda"));
                
                return p;
                
            }
            
            ps.close();
            rs.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
   public List<VendaProduto> produtosVendidos(){
        
        try{
            
            String sql = "Select * from produtovenda";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            List<VendaProduto> produtosVendidos = new ArrayList<>();
            while(rs.next()){
                VendaProduto vp = new VendaProduto();
                vp.setId(rs.getInt("id"));
               
                Produto p = produtoId(rs.getInt("produto_id"));
                vp.setProduto(p);
                Venda v = new VendaDAO().vendaId(rs.getInt("venda_id"));
                vp.setVenda(v);
                vp.setQuantidade(rs.getInt("quantidade"));
                produtosVendidos.add(vp);
            }
            
            ps.close();
            rs.close();
            
            return produtosVendidos;
            
           
        }catch(Exception e){
            
        }
        
         
        return null;
    }

}
