public class Main {
    public static void main(String[] args) {
        ContaBancaria contaCorrente = new ContaBancaria(1000);
        ContaBancaria contaPoupanca = new ContaBancaria(500);

        contaCorrente.sacar(800);
        contaPoupanca.sacar(600);
        contaCorrente.sacar(300);
    }
}
