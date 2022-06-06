
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro fusca = new Carro("Volkswagen",
				"Fusca",1998,1999,
				new Pneu("Firestone",13),
				new Pneu("Firestone",13), 
				new Pneu("Firestone",13),
				new Pneu("Firestone",13),
				new Pneu("Michelin",13)
				);
		Carro opala = new Carro("GM",
				"Opala",1998,1999,
				new Pneu("Firestone",15),
				new Pneu("Firestone",15), 
				new Pneu("Firestone",15),
				new Pneu("Firestone",15),
				new Pneu("Michelin",15)
				);
		Carro ferrari = new Carro("Ferrari",
				"Spider",2010,2011,
				new Pneu("Firestone",20),
				new Pneu("Firestone",20), 
				new Pneu("Firestone",20),
				new Pneu("Firestone",20),
				new Pneu("Michelin",20)
				);
		System.out.println(fusca);
		System.out.println(opala);
		System.out.println(ferrari);
	}

}
