package dp_observer;

public class Observer1 implements IObserver {

	@Override
	public void update(IObservable observable) {
		// POP
		System.out.println("Observer1 ha rrecivido notificacio del observable...");
		int state = ((Observable) observable).getState();
		System.out.println("Estado recivido: " + state + " tratamiento en curso...");

	}

}
