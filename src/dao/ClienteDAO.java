package dao;

import Classes.Cliente;
import Conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;

public class ClienteDAO {

    Conexao conexao;
    Connection conn;

    public ClienteDAO() {

        conexao = new Conexao();
        conn = this.conexao.getConexao();

    }

    public void cadastrarCliente(Cliente c) {

        try {

            String sql = "INSERT  INTO Cliente (nome,cpf,email,endereco,telefone) VALUES (?,?,?,?,?)";

            PreparedStatement stm = this.conn.prepareStatement(sql);

            stm.setString(1, c.getNome());
            stm.setString(2, c.getCpf());
            stm.setString(3, c.getEmail());
            stm.setString(4, c.getEndereco());
            stm.setInt(5, c.getTelefone());
            stm.execute();
            
            stm.close();

        } catch (Exception e) {

            System.out.println("Erro ao cadastrar cliente no banco de dados" + e.getMessage());
        }
        
       

    }
    
    public void deletarCliente(int id){
        
        try{
            
            String sql = "DELETE FROM Cliente WHERE id = ?";
            
            PreparedStatement stm = this.conn.prepareStatement(sql);
            
            stm.setInt(1, id);
            stm.execute();
            
            stm.close();
        }catch(Exception e){
            System.out.println("Erro ao deletar cliente no banco de dados " + e.getMessage());
        }
        
    }
    
    public List<Cliente> listar(){
    
    
        try{
            
            String sql = "SELECT * FROM Cliente";
            
            PreparedStatement stm = this.conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            
            List<Cliente> listaCliente = new ArrayList();
            
            while(rs.next()){
                Cliente c = new Cliente();
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setCpf(rs.getString("cpf"));
                c.setEmail(rs.getString("email"));
                c.setEndereco(rs.getString("endereco"));
                c.setTelefone(rs.getInt("telefone"));
                listaCliente.add(c);
            }
            
            stm.close();
            rs.close();
            
            return listaCliente;
            
           
        }catch(Exception e){
            System.out.println("Erro ao receber lista de clientes do banco de dados " + e.getMessage());
            return null;
        }
    }
    
    public void atualizarCliente(Cliente c, int id){
        
        try{
            
            String sql = "UPDATE Cliente SET nome = ?, cpf = ?, email = ?, endereco = ?, telefone = ? WHERE id = ?";
            PreparedStatement stm = this.conn.prepareStatement(sql);
            stm.setString(1, c.getNome());
            stm.setString(2, c.getCpf());
            stm.setString(3, c.getEmail());
            stm.setString(4, c.getEndereco());
            stm.setInt(5, c.getTelefone());
            stm.setInt(6, id);
            stm.execute();
            
            stm.close();
       
            
            
        }catch(Exception e){
            System.out.println("Erro ao atualizar cliente no banco de dados " + e.getMessage());
        }
        
    }
    
    public List<Cliente> pesquisarCliente(String filtro , String pesquisa){
            
          List<String> filtros = Arrays.asList("Nome","Cpf","Email","Endereco","Telefone");
            
            if(!filtros.contains(filtro)){
               throw new IllegalArgumentException("tipo invalido para filtrar " + filtro);
            }
            
        
        try{
            
            String sql = "SELECT * FROM Cliente WHERE " + filtro + " LIKE ?";
            
            PreparedStatement stm = this.conn.prepareStatement(sql);
          
            stm.setString(1, "%" + pesquisa + "%");
            ResultSet rs = stm.executeQuery();
         
            
            List<Cliente> listaCliente = new ArrayList();
            
            while(rs.next()){
                Cliente c = new Cliente();
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setCpf(rs.getString("cpf"));
                c.setEmail(rs.getString("email"));
                c.setEndereco(rs.getString("endereco"));
                c.setTelefone(rs.getInt("telefone"));
                listaCliente.add(c);
            }
            
            stm.close();
            rs.close();
            
            return listaCliente;
            
        }catch(Exception e){
            
            System.out.println("Erro ao receber lista de clientes por filtro " + e.getMessage());
            return null;
        }
        
    }
    

}
