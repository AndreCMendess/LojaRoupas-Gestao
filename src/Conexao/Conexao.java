
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Classe responsável por estabelecer uma conexao com o banco de dados
 * 
 */
public class Conexao {
    
    
    
    public  Connection getConexao(){
        
        String url = "jdbc:mysql://localhost/loja";
        String user = "root";
        String password = "dede1234.";
        
        try{
            
            Connection conn = DriverManager.getConnection(url,user,password);
            return conn;
            
        }catch(Exception e){
            System.out.println("Erro ao conectar com o banco de dados " + e.getMessage());
            return null;
        }
        
    }
    
}
