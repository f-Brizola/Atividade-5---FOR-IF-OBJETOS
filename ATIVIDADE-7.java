public class Produto {

    private int codigo;
    private String descricao;
    private double preco;
    private int quantidadeEmEstoque = 0;
  
    public Produto () {
        
    }

    public Produto(int codigo, String descricao, double preco, int quantidadeEmEstoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setAdicionarEstoque(int quantidade) {
        quantidadeEmEstoque = quantidadeEmEstoque + quantidade;
    }

    public void setRemoverEstoque(int quantidade) {
        if (quantidadeEmEstoque >= quantidade)
        {quantidadeEmEstoque = quantidadeEmEstoque - quantidade;}
        else {
            System.out.println("Estoque insuficiente");
        }
    }
}
