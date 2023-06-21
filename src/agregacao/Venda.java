package agregacao;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private Comprador comprador;
    private Vendedor vendedor;
    private List<Produto> produtos;

    public Venda(){
        this.produtos = new ArrayList<>();
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void concretizarVenda(){
        System.out.println(
                "Venda feita ao " + this.comprador.getNome() + " pelo vendedor " + this.vendedor.getNome() + " com os produtos abaixo."
        );
        this.produtos.forEach(
                produto -> System.out.println(
                        "Produto: " + produto.getNome() + " com valor de: " + produto.getPreco()
                )
        );
    }
    public void cancelarVenda(){
        System.out.println("Venda cancelada!");
    }


}
