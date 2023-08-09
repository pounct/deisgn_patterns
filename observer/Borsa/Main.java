
public class Main {

	public static void main(String[] args) {

		AgentDeBorsa observable = new AgentDeBorsa();
		IObserver o1 = new AgencieDeBorsa1();
		IObserver o2 = new AgencieDeBorsa2();
		IObserver o3 = new AgencieDeBorsa3();

		// registrar Observadors
		observable.registrarObservador(o1);
		observable.registrarObservador(o2);
		observable.registrarObservador(o3);

		// canviar l'estat
		observable.setState(20);

		// o2 no rebrà notificacions
		observable.baixaObservador(o2);

		observable.setState(77);

	}

}
