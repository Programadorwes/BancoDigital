public class Cliente {

    private String nome;
    private String cpf;
    private Conta conta;
    private Banco banco;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void detalhesCliente() {
        System.out.println("-- INFORMAÇÕES DO CLIENTE: --");
        System.out.println("NOME: " +  this.nome);
        System.out.println("CPF: " + this.cpf);
        this.conta.detalhesConta();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    
}
