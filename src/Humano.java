// O abstract faz com que os responsáveis pelo preenchimentos dos atributos dessa class sejam os filhos dela.
public abstract class Humano {

	// O chefe solicitou que a partir de hoje todos os Humanos deveriam ter um nome.
	private String nome;
	
	
	protected String sexo;
	private String corDoCabelo;
	private String roupa;
	private String corDaRoupa;
	private static int totalHumano;
	
	// Bloco construtor sendo preenchido com alguns parâmetros obrigatórios.
	// Também iremos executar um contador para sabermos a quantidade de humanos
	// existentes em nosso programa.
	// O chefe solicitou que todos os humanos já deveriam ser criados com os atributos preenchidos.
	public Humano(String nome, String sexo,String corDoCabelo,String roupa,String corDaRoupa) {
		// add
		this.nome = nome;
		
		this.sexo = sexo;
		this.corDoCabelo = corDoCabelo;
		this.roupa = roupa;
		this.corDaRoupa = corDaRoupa;
		totalHumano ++;
	}
	
	public abstract void getSexo();
	
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
		System.out.println();
		System.out.print("Total de humanos: ");
		return this.totalHumano;
	}
	
	//add
	public String getNome() {
		return this.nome;
	}
	
	// Foi solicitado a criacao de um metodo que retornasse as informacoes do humano
	public void getInfo() {
		System.out.println();
		System.out.println(this.getNome() + ", seu cabelo é da cor " + this.getCorDoCabelo() +
				 ", esta vestindo um " + this.getRoupa() + " e essa roupa e da cor " + this.getCorDaRoupa() + ".");
	}
}
