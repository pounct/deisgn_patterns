package mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediador1 extends AMediador {
	private List<Missatge> conversa = new ArrayList<Missatge>();

	@Override
	public void transmetreMissatge(Missatge msg) {
		System.out.println("************** Mediador 1 ***************");
		System.out.println(" transmetre el missatge de: " + msg.getRemitent() + " a " + msg.getDestinari());
		System.out.println("contingut :" + msg.getContingut());
		ACollega destinari = collegas.get(msg.getDestinari());
		destinari.rebre(msg);

		conversa.add(msg);

	}

	// podem afegir un mètode per analitzar la conversa
	public void analitzarConversa() {
		conversa.forEach(System.out::println);
	}

}
