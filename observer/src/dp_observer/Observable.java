package dp_observer;

import java.util.ArrayList;
import java.util.List;

public class Observable implements IObservable {

	private int state = 6;

	List<IObserver> observers = new ArrayList<IObserver>();

	@Override
	public void registrarObservador(IObserver observer) {

		observers.add(observer);
	}

	@Override
	public void baixaObservador(IObserver observer) {

		observers.remove(observer);
	}

	@Override
	public void notificar() {

		for (IObserver observer : observers) {

			observer.update(this);
		}
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		this.notificar();
	}

}
