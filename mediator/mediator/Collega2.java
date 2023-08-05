package mediator;

public class Collega2 extends ACollega {

	public Collega2() {
	}

	public Collega2(String nom, AMediador mediador) {
		super(nom, mediador);
	}

	@Override
	public void enviar(Missatge msg) {

		System.out.println("Collega1 " + nom);
		System.out.println("enviant el missatge a" + msg.getDestinari());
		msg.setRemitent(nom);

		mediador.transmetreMissatge(msg);

	}

	@Override
	public void rebre(Missatge msg) {

		System.out.println("Collega1 " + nom);
		System.out.println("rebent el missatge :");
		System.out.println("contingut : " + msg.getContingut());
		System.out.println("remitent :" + msg.getRemitent());

	}

}
