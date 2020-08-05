
public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 4444);

		conta.deposita(200.0);
		try {
			conta.saca(210.0);
		} catch (SaldoInsuficienteException ex) {
			System.out.println("Mensagem da exceção -> " + ex.getMessage());
		}

		System.out.println(conta.getSaldo());

	}

}
