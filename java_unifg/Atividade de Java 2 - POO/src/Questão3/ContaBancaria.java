package Questão3;

public class ContaBancaria {
    String numeroConta;
    double saldo;

public ContaBancaria(String numeroConta) {
    this.numeroConta = numeroConta;
    this.saldo = 0.0;
}

public void depositar(double valor) {
    if (valor > 0) {
        saldo += valor;
        System.out.println("Deposito de R$ " + valor + " realizado com sucesso!");
    } else {
        System.out.println("Valor insuficiente");
    }
}

public void sacar(double valor) {
    if (valor > 0 && saldo >= valor) {
        saldo -= valor;
        System.out.println("Saque de " + valor + " realizado com sucesso!");}
    else {
        System.out.println("Não foi possível realizar o saque!");
    }
}

public void verificarSaldo() {
    System.out.println("O Saldo atual da conta " + numeroConta + " é: " + saldo);

  }
}
