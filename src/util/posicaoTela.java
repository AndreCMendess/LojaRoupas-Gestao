
package util;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;


public class posicaoTela {
    
   
    
    public void abrirTela(JInternalFrame janela,JPanel painel){
        
      
        int iDesk = painel.getWidth();
        int aDesk = painel.getHeight();
         
        janela.setSize(iDesk, aDesk);
        janela.setLocation(0,0);
        painel.add(janela);
        janela.setResizable(false);
        janela.setVisible(true);
        
       
                
        
    }

}