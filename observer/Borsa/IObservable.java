
public interface IObservable {

	//// alta registrar un observador (afegir un observador a sus observadores)

	public void registrarObservador(IObserver observer);

	// baixa anular egistrar observador(eliminar un observador de sus observadores

	public void baixaObservador(IObserver observer);

	// notificar sus observadores

	public void notificar();

}
