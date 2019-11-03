
public class Adapter extends SomadorExistente implements SomadorEsperado{

	public int somaVetor(int[] vetor) {
		int resultado = 0;

		for(int i = 0; i < vetor.length; i++) {
			resultado += vetor[i];
		}

		return resultado;
	}
}
