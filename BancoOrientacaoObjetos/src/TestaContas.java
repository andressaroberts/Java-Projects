
public class TestaContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
		ContaCorrente cc = new ContaCorrente(64645, 9897);
		cc.deposita(100.0);

		ContaPoupanca cp = new ContaPoupanca(64124, 87451);
		cp.deposita(200.0);

		cc.transfere(10.0, cp);

		System.out.println("Saldo atual conta corrente R$" + cc.getSaldo());
		System.out.println("Saldo atual conta poupança R$" + cp.getSaldo());

	}

}
