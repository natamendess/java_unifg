package Questão10;

public class Triangulo {
    double base;
    double altura;

public Triangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
}
public void calcularArea() {
    double area = (base * altura) / 2;
    System.out.println("A área do triângulo é: " + area);
}
}
