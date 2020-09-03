package fiado;

public class Consumidor {

	private String nome;
	private String telefone;
	private int nmrDeComprasFiadas;
	private int[] fiados;
	private int posicao = 0;
	
	public Consumidor(String nome, String telefone, int nmrDeComprasFiadas) {
		this.nome = nome;
		this.telefone = telefone;
		this.nmrDeComprasFiadas = nmrDeComprasFiadas;
		this.fiados = new int[nmrDeComprasFiadas];
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getNmrDeComprasFiadas() {
		return nmrDeComprasFiadas;
	}

	public void setNmrDeComprasFiadas(int nmrDeComprasFiadas) {
		this.nmrDeComprasFiadas = nmrDeComprasFiadas;
	}

	public int getFiados() {
		int total = 0;
		for(int fiado: fiados) {
			total += fiado;
		}
		return total;
	}

	public void registrarFiado(int valor) {
		this.fiados[posicao] = valor;
		posicao++;
	}
	
}
