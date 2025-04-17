public class Questão6 {
    public static void main(String[] args) {
        int numero = 8;
        int i = 1;

        System.out.println("Tabuada do número " + numero + ":");

        while (i <= 10) {
            int resultado = numero * i;
            System.out.println(numero + " * " + i + " = " + resultado);
            i = i + 1;
        }
    }
}
