public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

	private static int total = 0;

	public Conta(int agencia, int numero) {
		total++;
		this.agencia = agencia;
		this.numero = numero;
	}

	public abstract void deposita(double valor);

	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo atual: " + this.saldo + " Valor que quer sacar: " + valor);
		} else {
			this.saldo -= valor;
		}
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não pode informar um valor menor ou igual a 0, mano");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode inserir valor menor ou igual a 0, parça");
			return;
		}

		this.agencia = agencia;

	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
}