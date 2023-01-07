// Aqui eu estou herdando os atributos da class Humano
// Na class humano existe um bloco construtor e esse bloco não é herdado. 
// A solução está abaixo
public class Homem extends Humano{
	
	// A solução para o bloco construtor não herdade é essa:
	// Construir um bloco construtor para a class de herança e definir os mesmos paâmetros.
	// Depois é só colocar um comportamento que direciona esses inputs ao construtor da class super, 
	// isto é, ao construtor da class herdada.
	public Homem (String sexo,String corDoCabelo,String roupa,String corDaRoupa) {
		super(sexo,corDoCabelo, roupa, corDaRoupa);
	}
	
	
	// Aqui eu reescreto o método getSexo.
	// Agora ele além de retornar as informações sobre o sexo, também irá exibir algumas mensagens
	// diferentes para o Homem.
	@Override
	public String getSexo() {
		System.out.println("Seja bem-vindo ao mundo da programacao!");
		System.out.println("Gostaria de jogar futebol nesse final de semana?");
		return super.getSexo();
	}
}
