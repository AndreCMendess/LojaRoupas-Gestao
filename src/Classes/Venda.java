
package Classes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;


public class Venda {
    private int id; 
    private List<VendaProduto> produtoVenda;
    private int quantidade;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    private double valorVenda;
    private Calendar dataVenda;
    private Calendar dataPagamento;
    private Cliente cliente;
    private String naoCliente;
    private boolean status;

    public Venda() {
    }

    public List<VendaProduto> getProdutoVenda() {
        return produtoVenda;
    }

    public void setProdutoVenda(List<VendaProduto> produtoVenda) {
        this.produtoVenda = produtoVenda;
    }

  
    

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Calendar getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Calendar dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Calendar getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Calendar dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNaoCliente() {
        return naoCliente;
    }

    public void setNaoCliente(String naoCliente) {
        this.naoCliente = naoCliente;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String dataPagamento(){
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        if(this.dataPagamento != null){
        String dP = data.format(this.dataPagamento.getTime());
        
        return dP;
        }else{
            return null;
        }
    }
    
      public String dataVenda(){
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        if(this.dataVenda != null){
        String dP = data.format(this.dataVenda.getTime());
        
        return dP;
        }else{
            return null;
        }
    }
      
     
}
