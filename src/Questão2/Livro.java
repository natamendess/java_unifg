package Questão2;

public class Livro {
    String titulo;
    String autor;
    int numPaginas;

public Livro(String titulo, String autor, int numPaginas) {
    this.titulo = titulo;
    this.autor = autor;
    this.numPaginas = numPaginas;
}

public void exibirInformacoes(){
    System.out.println("Titulo: " + this.titulo);
    System.out.println("Autor: " + this.autor);
    System.out.println("numPaginas: " + this.numPaginas);
}
}
