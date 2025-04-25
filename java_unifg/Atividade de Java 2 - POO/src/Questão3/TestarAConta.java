package Questão3;

public class TestarAConta {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("123456-7");

        conta.depositar(800);
        conta.sacar(500);

        conta.verificarSaldo();
    }
}
