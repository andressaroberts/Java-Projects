
public class Conexao implements AutoCloseable{ //o contrato com a interface AutoCloseable exige a implementação do metodo close()
	public Conexao() {
        System.out.println("Abrindo conexao");
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException();
    }


	@Override
	public void close() {
		System.out.println("Fechando conexao");
	}
}
