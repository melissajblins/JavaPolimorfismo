public class TestaFuncionario {
	public static void main(String[] args) {
		// Testando Polimorfismos
		Gerente gerenteMelissa = new Gerente ("Melissa", "22222222222", 2345.56); 
		
		System.out.println(gerenteMelissa.getBonificacao());
	}
}
