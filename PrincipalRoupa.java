package aula6;

public class PrincipalRoupa {

	public static void main(String[] args) {
		
		for (MarcaRoupa marca : MarcaRoupa.values()) {
			System.out.println("----------");
			System.out.println(marca);
		}

	}

}
