package Questão4;

public class CalculoRetangulo {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(4,6);

    double area = retangulo.CalcularArea();
    double perimetro = retangulo.CalcularPerimetro();

    System.out.println("A área do retangulo é: " + area);
    System.out.println("O perímetro do retangulo é: " + perimetro);
    }
}
