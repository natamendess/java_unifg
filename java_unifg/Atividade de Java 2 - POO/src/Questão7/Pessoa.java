package Questão7;

public class Pessoa {
    String nome;
    int idade;

public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
}
public void fazerAniversario() {
    this.idade = this.idade + 1;
    System.out.println(nome + " fez aniversário");
}

public void visualizarIdade() {
    System.out.println("A idade de " + nome + " é: " + idade + " anos");
   }
}
