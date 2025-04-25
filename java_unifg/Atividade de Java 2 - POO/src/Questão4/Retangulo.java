package Questão4;

public class Retangulo {
    double largura;
    double altura;

public Retangulo(double largura, double altura) {
    this.largura = largura;
    this.altura = altura;
}

public double CalcularArea() {
    return largura * altura;
}
public double CalcularPerimetro() {
    return 2 * (largura + altura);
}
}
