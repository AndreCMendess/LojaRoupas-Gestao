
package Classes;

import java.util.Objects;


public class VendaProduto {
    int id;
    Venda venda;
    Produto produto;
    int quantidade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
      


    
    public VendaProduto() {
        
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return getProduto().getNome();
    }
    
        @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VendaProduto vendaProduto = (VendaProduto) obj;
        return produto.equals(vendaProduto.produto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(produto);
    }
    
}
