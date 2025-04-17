public class Questão5 {
    public static void main(String[] args) {
        double peso = 72.0;
        double altura = 1.70;

        double imc = peso/(altura*altura);

        System.out.printf("O IMC é: %.2f" , imc);
    }
}
