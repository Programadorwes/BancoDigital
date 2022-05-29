public class ContaCorrente extends Conta {

    public ContaCorrente(Banco banco, Cliente cliente, double limite) {
        super(banco, cliente, limite);
        
    }

    @Override
    public void detalhesConta() {
        super.detalhesConta();
        System.out.println("TIPO DE CONTA: Conta corrente");
    }

    @Override
    public void taxa() {
        this.saldo -= 15.50;
    }
}
