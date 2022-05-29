public class App {
    public static void main(String[] args) throws Exception {

        Banco bb = new Banco("Banco do Brasil S/A", 230);

        Cliente cliente1 = new Cliente("Fulano de Tal", "999.999.999-90");
        Cliente cliente2 = new Cliente("Cicraninho", "111.111.111-11");

        ContaCorrente cc = new ContaCorrente(bb, cliente1, 2000);
        ContaCorrente cc2 = new ContaCorrente(bb, cliente2, 2000);

        cliente1.setConta(cc);
        cliente2.setConta(cc2);

        cc.depositar(100);
        cc.transferir(cc2, 50);

        cc.detalhesConta();
        cc2.detalhesConta();

        cliente1.detalhesCliente();
        cliente2.detalhesCliente();
       
    }
    
}
