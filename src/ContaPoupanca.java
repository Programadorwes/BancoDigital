public class ContaPoupanca extends Conta{

    public ContaPoupanca(Banco banco, Cliente cliente, double limite) {
        super(banco, cliente, limite);
    }

@Override
    public void detalhesConta() {
        super.detalhesConta();
        System.out.println("TIPO DE CONTA: Conta poupança");
    }

@Override
    public void taxa() {
        this.saldo += this.saldo*0.005;
    }
    
}
