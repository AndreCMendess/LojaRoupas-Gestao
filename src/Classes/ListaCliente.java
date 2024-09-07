
package Classes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import visao.Principal;

public class ListaCliente {
 
    // Criação de uma ArrayList do tipo <cliente> , que representa a lista de clientes registrados.
    private static ArrayList<Cliente>  registroClientes = new ArrayList<Cliente>();
    
   
    
    //Metodo para adicionar um cliente na lista de clientes registrados.
    
    public static boolean adicionar(Cliente cliente){   
    
       /*Try - Catch para testar se o cliente for nulo o metodo retornara falso , se nao for nulo o cliente sera adicionado a lista de clientes e
        o id sera registrado na forma de o numero de quantidade de clientes que ja esta na lista + 1 */
       
      try{
          if(cliente == null){
              throw new IllegalArgumentException("O cliente nao pode ser nulo");
            
          }
          
          cliente.setId(registroClientes.size()+1);
          registroClientes.add(cliente);
         
          return true;
          
      }catch(IllegalArgumentException ex){
          System.out.println(ex.getMessage());
      }
       return false;
    }
    
    //Metodo para retorna o registro de clientes 
    public static ArrayList<Cliente> listar(){
        return registroClientes;
    }
    
    
    // Metodo para atualizar dados de um determinado cliente , utilizando um indice para pegar sua posição no vetor do registro de clientes
    public static boolean atualizar(int id , Cliente cliente){
        
        try{
            
            if(cliente == null){
             throw new IllegalArgumentException("O cliente nao pode ser nulo ");
          
            }
            
            if(id < 0 && id >= registroClientes.size()){
                throw new IllegalArgumentException("O id tem que ser maior que 0 e menor que a quantidade de clientes registraod na lista");
            }
            
              registroClientes.set(id, cliente);
              return true;
            
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());   
        }
            return false;
    }
    
    /* Metodo para atualziar um cliente que ja esta no adicionado no registroCliente ,Recebera o id do cliente ao clicar na linha da tabela ,
     e escrevera todos os dados da clase Cliente para alteraçao */
    public static boolean atualizarNoRegistro(Cliente c,String nome,String cpf,String email,String endereco,int telefone){
        
       
        if(c != null){ //Se foi bem sucessido o passo a cima e for diferente de null , atualizara todos os dados de acordo ocm o que foi escrito
        c.setNome(nome);
        c.setCpf(cpf);
        c.setEmail(email);
        c.setEndereco(endereco);
        c.setTelefone(telefone);     
        return true;
        
        }else{
            System.out.println("Falha ao atualizar no registro");
        }
        return false;
    }
      
   
    
    // Metodo para excluir cliente por id 
    public static void excluirCliente(int id){
        try{
            
            if(id >=0 && id < registroClientes.size()){// verifica se o id é maior que 0 ou menor que o numero de clientes registraods , para confirmar que o cliente realmente existe
                
                
                
                String [] options = {"Sim","Não"};//String para sim e nao para utilizar no JOptionPane
                int deletar = JOptionPane.showOptionDialog(null, "Deseja deletar esse cliente ?",
                        "Excluir cliente",JOptionPane.DEFAULT_OPTION,
                        JOptionPane.WARNING_MESSAGE, null, options, options[0]);//Se sim , o deletar recebe 0 
                if(deletar == 0){// se no joptionpane foi escolhido sim , deletar rebera 0 e o cliente sera deletado
                registroClientes.remove(id);
               
                }else{
                    JOptionPane.showMessageDialog(null,"Erro ao deletar o cliente");
                }
            }else{// se o id é invalido , recebera essa excepçao para uso posterior
                throw new IllegalArgumentException("O id do cliente invalido para deletar");
            }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
    }
    
    //metodo para validar dados inseridos da caixa de texto da interface
    public static boolean validarDados(String[] dados){
        
        // Codigo para validar se a string dados que sera passada para validação realmente existe
        for(int i = 0; i<dados.length; i++){
        
            if(dados[i] == null || dados[i].isEmpty()){
                
                System.out.println("Verifique se esta usando um indice de uma variavel do tipo String e que realmente exista");
                
            }
            
          }
        
        // Valida todos os parametros strings colocados no metodo por meio de regex e capos vazios 
        boolean validarNome = !dados[0].isEmpty();
        boolean validarCpf = dados[1].matches("[0-9]{3}[.][0-9]{3}[.][0-9]{3}[-][0-9]{2}");// 000.000.000-00
        boolean validarEmail = dados[2].matches("[\\w\\.\\?]+@\\w+\\.\\w{2,3}");
        boolean validarEndreco = !dados[3].isEmpty();
        boolean validarTelefone = dados[4].matches("[0-9]{9}");//9 numeros inteiros
        
        try{
            if(!validarNome){
                
                throw new IllegalArgumentException("O nome nao pode ser vazio.");
               
            }
            
            if(!validarCpf){
                throw new IllegalArgumentException("O cpf deve ser escrito dessa forma 000.000.000-00");
               
            }
            
            
            if(!validarEmail){
                throw new IllegalArgumentException("O email deve ser escrito dessa forma cliente@gmail.com");
               
            }
            
            if(!validarEndreco){
                throw new IllegalArgumentException("O endereço nao pode ser vazio");
               
            }
            
            if(!validarTelefone){
                throw new IllegalArgumentException("O telefone deve ser escrito na forma de 31912344123");
                
            }
            
          
        }catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
           return false;
        }
        return true;
    }
    
    
}
