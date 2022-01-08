public class TestaContas {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(124, 234);
		contaCorrente.deposita(100);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(934, 234);
		contaPoupanca.deposita(200);
		
		contaCorrente.transfere(50, contaPoupanca);
	}
}
