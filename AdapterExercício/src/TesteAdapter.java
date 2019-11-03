
public class TesteAdapter {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(new Adapter());

		cliente.executar();
	}
}
