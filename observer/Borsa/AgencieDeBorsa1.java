
public class AgencieDeBorsa1 implements IObserver {

	@Override
	public void update(IObservable observable) {
		// POP
		System.out.println("Observer1 ha rrecivido notificacio del Agent De Borsa...");
		int state = ((AgentDeBorsa) observable).getState();
		System.out.println("Estado recivido: " + state + " y update en curso...");

	}

}
