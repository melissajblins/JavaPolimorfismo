public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
			
	}
	
	@Override
	public boolean saca(double valor) {
		double taxaSaque = 0.20;
		return super.saca(valor + taxaSaque);
	}
}
