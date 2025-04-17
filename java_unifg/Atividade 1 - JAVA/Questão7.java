public class Questão7 {
    public static void main(String[] args) {
        int num1 = 4, num2 = 6, num3 = 8;

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("O maior valor é: " + num1);

        } else if (num2 >= num1 && num2 >= num3){
            System.out.println("O maior valor é: " + num2);

        } else  {
            System.out.println("O maior valor é: " + num3);
        }
    }
}
