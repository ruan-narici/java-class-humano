// O abstract faz com que os responsáveis pelo preenchimentos dos atributos dessa class sejam os filhos dela.
public abstract class Humano {

	private String sexo;
	private String corDoCabelo;
	private String roupa;
	private String corDaRoupa;
	private static int totalHumano;
	
	// Bloco construtor sendo preenchido com alguns parâmetros obrigatórios.
	// Também iremos executar um contador para sabermos a quantidade de humanos
	// existentes em nosso programa.
	public Humano(String sexo,String corDoCabelo,String roupa,String corDaRoupa) {
		this.sexo = sexo;
		this.corDoCabelo = corDoCabelo;
		this.roupa = roupa;
		this.corDaRoupa = corDaRoupa;
		totalHumano ++;
	}
	
	public String getSexo() {
		System.out.println("Ele é um humano!");
		return sexo;
	}
	

	public String getCorDoCabelo() {
		return corDoCabelo;
	}
	
	public void setCorDoCabelo(String corDoCabelo) {
		this.corDoCabelo = corDoCabelo;
	}
	
	public String getRoupa() {
		return roupa;
	}
	
	public void setRoupa(String roupa) {
		this.roupa = roupa;
	}
	public String getCorDaRoupa() {
		return corDaRoupa;
	}
	
	public void setCorDaRoupa(String corDaRoupa) {
		this.corDaRoupa = corDaRoupa;
	}
	
	public int getTotalHumano() {
		return this.totalHumano;
	}
}
