package Questão8;

public class DescontoProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Chocolate",80);

        produto.exibirPreco();
        produto.aplicarDesconto(10);
        produto.exibirPreco();
}
    }