package agregacao;

public class Main {
    public static void main(String[] args){
        Produto produtoPrestigio = criarProduto(1L, 10d, "Prestígio");
        Produto produtoFeverPitch = criarProduto(2L, 100d, "Livro Fever Pitch");

        Vendedor vendedorBuken = criarVendedor("Buken", 1000d);
        
        Comprador compradorGuilherme = criarComprador();

        Venda venda = new Venda();
        venda.setComprador(compradorGuilherme);
        venda.setVendedor(vendedorBuken);
        venda.addProduto(produtoPrestigio);
        venda.addProduto(produtoFeverPitch);

        venda.concretizarVenda();
    }

    private static Comprador criarComprador() {
        return new Comprador("Guilherme", 5000d);
    }

    private static Vendedor criarVendedor(String nome, Double comissao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setNome(nome);
        vendedor.setComissao(comissao);
        return vendedor;
    }

    private static Produto criarProduto(Long codigo, Double preco, String nome) {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setPreco(preco);
        produto.setNome(nome);
        return produto;
    }
}
