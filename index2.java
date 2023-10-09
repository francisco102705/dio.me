// Aspecto para verificar saldo
public aspect VerificacaoSaldoAspect {
    pointcut todasAsContas(): within(ContaBancaria+);

    before(): todasAsContas() {
        System.out.println("Verificando saldo em todas as contas...");
    }

    before(double valor): call(void ContaBancaria.sacar(double)) && args(valor) {
        if (thisEnclosingJoinPointStaticPart.getSourceLocation().getFileName().contains("ContaBancaria")) {
            System.out.println("Tentativa de saque de " + valor + " em uma conta bancária.");
        }
    }
}
