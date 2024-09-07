package Classes;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import visao.Principal;

public class ListaProduto  {

    private static ArrayList<Produto> estoque = new ArrayList<Produto>();
  

    
    public static int quantidadeProduto(){
        
        int quantidade;
        for(Produto p : estoque){
           quantidade = p.getQuantidade();
            return quantidade;
        }
      return 0;
    }

    public static boolean adicionar(Produto p) {

        try {
            if (p == null) {
                throw new IllegalArgumentException("Produto não pode ser nulo");
            }

            p.setId(estoque.size() + 1);
            estoque.add(p);
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

    public static ArrayList<Produto> listar() {
        return estoque;
    }

    public static boolean atualizar(int index, Produto novoProduto) {
        if (index >= 0 && index < estoque.size() && novoProduto != null) {
            estoque.set(index, novoProduto);
            return true;
        }
        return false;
    }

    public static void atualizarProdutoNoEstoque(Produto p, String nome, String descricao, String tamanho, String valorCompra, String valorVenda, String quantidade) {

       
        if (p != null) {
        
            p.setNome(nome);
            p.setDescricao(descricao);
            p.setTamanho(tamanho);
            p.setValorCompra(Double.parseDouble(valorCompra));
            p.setValorVenda(Double.parseDouble(valorVenda));
            p.setQuantidade(Integer.parseInt(quantidade));
            
        }

    }

    public static boolean validarDados(String nome, String descricao, String tamanho, String valorCompra, String valorVenda, String quantidade) throws dadosProdutoException {

        boolean validarNome = !nome.isEmpty();
        boolean validarDescricao = descricao.matches("[a-zA-Z0-9]+");
        boolean validarTamanho = tamanho.matches("[MUPPGG]{1,2}");
        boolean validarValorCompra = valorCompra.matches("[1-9]\\d*");
        boolean validarValorVenda = valorVenda.matches("[1-9]\\d*");
        boolean validarQuantidade = quantidade.matches("([1-9][0-9]*)");

        if (!validarNome) {
            throw new dadosProdutoException(" O nome do produto não pode ser vazio ");

        } else if (!validarDescricao) {
            throw new dadosProdutoException("A descrição do produto deve ser escrito com caracteres e numeros");

        } else if (!validarTamanho) {
            throw new dadosProdutoException("O tamanho do produto deve ser M,U,P,PP,G OU GG");

        } else if (!validarValorCompra) {
            throw new dadosProdutoException("O valor da Compra deve ser um numero inteiro maior que 0");

        } else if (!validarValorVenda) {
            throw new dadosProdutoException("O valor da venda deve ser um numero inteiro maior que 0 e de preferencia maior que o valor da compra");

        } else if (!validarQuantidade) {
            throw new dadosProdutoException("A quantidade do produto deve ser maior que 0 ");

        }

        return true;

    }

    public static boolean excluirTabela(int id) {

        try {

            if (id < 0) {
                JOptionPane.showMessageDialog(null, "Selecione um iten da tabela!");
            } else {
                estoque.remove(id);
                return true;
            }

        } catch (Exception e) {
              Logger.getLogger(ListaProduto.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    public static class dadosProdutoException extends Exception {

        public dadosProdutoException(String mensagem) {
            super(mensagem);
        }
    }
    
     /*public void atualizarTabelaProduto(int indice,String nome,String descricao,String tamanho,String valorCompra,String valorVenda, String quantidade){
      
        tabelaProduto.setValueAt(nome, indice, 0);
        tabelaProduto.setValueAt(descricao , indice, 1);
        tabelaProduto.setValueAt(tamanho, indice, 2);
        tabelaProduto.setValueAt(valorCompra, indice, 3);
        tabelaProduto.setValueAt(valorVenda, indice, 4);
        tabelaProduto.setValueAt(quantidade, indice, 5);
        
    }*/
    
}
