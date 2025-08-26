class ContaPoupanca extends Conta {
    private static final double TAXA_RENDIMENTO = 0.005; // 0.5% ao mês

    public ContaPoupanca(String numero, String titular) {
        super(numero, titular);
    }

    public void aplicarRendimento() {
        this.saldo += this.saldo * TAXA_RENDIMENTO;
        System.out.printf("Rendimento aplicado. Novo saldo: R$%.2f%n", this.saldo);
    }
}
