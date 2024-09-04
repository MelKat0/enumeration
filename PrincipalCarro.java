package aula6;

public class PrincipalCarro {

	public static void main(String[] args) {
		for (Carro marca : Carro.values()) {
			System.out.println("----------");
			System.out.println(marca);
		}
		
	}

}
