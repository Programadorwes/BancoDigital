import java.util.ArrayList;

public class Banco {

    private String nome;
    private int numero;
    private ArrayList<Conta> listaContas = new ArrayList<>();
    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    
    public Banco(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void detalhesBanco() {
        System.out.println("NOME BANCO: " +  this.nome);
        System.out.println("NUMERO: " + this.numero);
    }

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

}