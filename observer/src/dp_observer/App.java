package dp_observer;

public class App {

	public static void main(String[] args) {

		Observable observable = new Observable();
		IObserver o1 = new Observer1();
		IObserver o2 = new Observer2();
		IObserver o3 = new Observer3();

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
