
public class JardimDoEden {

	public static void main(String[] args) {
		
		Homem ruan = new Homem("Ruan", "masculino", "preta", "terno", "preta com azul");
		Mulher cinthia = new Mulher("Cinthia", "feminino", "ruiva", "vestido", "vermelha");
		Mulher nayara = new Mulher("Nayara", "feminino", "castanho", "vestido", "dourada");
		
		ruan.getSexo();
		cinthia.getSexo();
		nayara.getSexo();
		
		ruan.getInfo();
		cinthia.getInfo();
		nayara.getInfo();
		
		System.out.println(ruan.getTotalHumano());
	}
}
