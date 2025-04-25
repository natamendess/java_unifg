package Questão8;

public class Produto {
    String nome;
    double preco;


public Produto(String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
}

public void aplicarDesconto(double percentual) {
    if (percentual > 0 && percentual <= 100) {
        double desconto = preco * (percentual / 100);
        preco -= desconto;
        System.out.println("Desconto de: " + percentual + "%");
    } else {
        System.out.println("percentual de desconto invalido");
    }
 }

 public void exibirPreco(){
    System.out.println("preço do produto: " + nome + " R$ " + preco);
 }
}

