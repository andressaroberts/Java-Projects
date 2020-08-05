
public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(2222, 3333);
		cc.deposita(100.0);

		SeguroVida seguro = new SeguroVida();

		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);

		System.out.println(calc.getTotalImposto());
	}

}
