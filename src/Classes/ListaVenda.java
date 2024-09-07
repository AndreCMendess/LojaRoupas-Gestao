
package Classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ListaVenda {
    
    private static ArrayList<Venda> registroVendas = new ArrayList();
    
    public static boolean adicionarVenda(Venda venda){
        
        if(venda != null){
            venda.setId(registroVendas.size()+1);
            registroVendas.add(venda);
            return true;
        }
        
         return false;
    }
    
    public static ArrayList<Venda> listar(){
        return registroVendas;
    }
    
    public static boolean deletarVenda(int id){
        
        if(id >=0 && id < registroVendas.size()){
            
            String[] options = {"Sim","Não"};
            int deletar = JOptionPane.showOptionDialog(null, "Tem certeza que deseja deletar?", "Deletar", id, id,null, options, options[0]);
            if(deletar == JOptionPane.YES_OPTION){
                registroVendas.remove(id);
                JOptionPane.showMessageDialog(null,"Venda Deletada Com Sucesso");
                return true;
            }else{
                return false;
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma venda para deletar");
            return false;
        }
        
    }
    
    
  
    
    public static boolean validarDados(List<VendaProduto> p, String dataVenda, String dataCompra, JComboBox qnt, String valorTotal, Cliente c, String naoCliente) {

        boolean validarDataVenda = validarData(dataVenda);
        boolean validarDataPagamento = validarData(dataCompra);
        boolean cliente = c instanceof Cliente;
        
       

        if (p == null || p.isEmpty() || qnt.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Selecione o produto e sua quantidade");
            return false;
        }

        if (!cliente || !naoCliente.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Selecione um cliente registrado da loja ou escreva os dados do novo cliente");
            return false;
          
        } else if (valorTotal.isEmpty()) {
            JOptionPane.showMessageDialog(null, "selecione a quantidade do produto para a venda");
            return false;
        } else if (!validarDataVenda) {
            JOptionPane.showMessageDialog(null, "a data da venda deve ser no formato de dd/mm/yyyy");
            return false;
        } else if (!validarDataPagamento) {
            JOptionPane.showMessageDialog(null, "a data do pagamento deve ser no formato de dd/mm/yyyy");
            return false;
        }

        return true;
    }

 
    
    private static boolean validarData(String data){
        
        
        if(data.trim().isEmpty()){
            return false;   
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        try{
            sdf.parse(data);
            return true;
        }catch(ParseException ex){
            return false;
        }
    }
    
    
    
    
    
    
} 
    
    

