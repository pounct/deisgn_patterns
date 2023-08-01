package adapter;

public class App {

	public static void main(String[] args) {

		IEstandard estandard = new Estandard();
		estandard.metodeEstandard(2, 3);

		IEstandard adaptatHerencia = new AdaptadorHerencia();
		adaptatHerencia.metodeEstandard(2, 3);

		IEstandard adaptatComposicio = new AdaptadorComposicio();
		adaptatComposicio.metodeEstandard(2, 3);
	}

}
