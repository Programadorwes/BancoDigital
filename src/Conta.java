abstract class Conta {

    private static final int agenciaPadrao = 1020;
    private static int sequencial = 1;

    protected int agencia;
    private int numeroConta;
    protected double saldo;
    private Banco banco;
    private Cliente cliente;
    private double limite;

    public Conta(Banco banco, Cliente cliente, double limite) {
        this.agencia = agenciaPadrao;
        this.numeroConta = sequencial++;
        this.banco = banco;
        this.cliente = cliente;
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Banco getBanco() {
        return banco;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito efetuado com sucesso!");
    }

    public void sacar(double valor) {
        if(podeSacar(valor)) {
            this.saldo -= valor;
            System.out.println("Saque efetuado com sucesso!");
        } else {
            System.out.println("O valor " + valor + " passou do limite.");
        }
    }

    public void transferir(Conta conta, double valor) {
        if(podeTransferir(valor)) {
            conta.setSaldo(conta.getSaldo() + valor);
            this.saldo -= valor;
            System.out.println("Transferência efetuada com sucesso!");
        } else {
            System.out.println("Transferência Indisponível. ");
        }
    }

    public void detalhesConta() {
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("AGÊNCIA: " + this.agencia);
        System.out.println("CONTA: " + this.numeroConta);
        System.out.println("SALDO DA CONTA: R$ " + this.saldo);
    }

    private boolean podeSacar(double valor) {
        double valorDispoParaSacar = this.saldo + this.limite;
        return valor <= valorDispoParaSacar;
    }

    private boolean podeTransferir(double valor) {
        double valorDispoParaTransf = this.saldo;
        return valor <= valorDispoParaTransf;
    }

    public void taxa() {

    }

}
