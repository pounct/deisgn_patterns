package mediator;

public class Mediador2 extends AMediador {
	// mediador statless
	// private List<Missatge> conversa = new ArrayList<Missatge>();

	@Override
	public void transmetreMissatge(Missatge msg) {
		System.out.println("************** Mediador 2 statless ***************");
		System.out.println(" transmetre el missatge de: " + msg.getRemitent() + " a " + msg.getDestinari());
		System.out.println("contingut :" + msg.getContingut());
		ACollega destinari = collegas.get(msg.getDestinari());
		destinari.rebre(msg);
	}

}
