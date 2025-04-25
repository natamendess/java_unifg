package Questão6;

public class Circulo {
    double raio;


public Circulo(double raio) {
    this.raio = raio;
}
public void calcularArea() {
 double area = Math.PI * raio * raio;
 System.out.println("Área do circulo: " + String.format("%.2f", area));

}

public void calcularCircunferencia() {
    double circunferencia = 2 * Math.PI * raio;
    System.out.println("Circunferência do circulo: " + String.format("%.2f" , circunferencia));

   }
}
