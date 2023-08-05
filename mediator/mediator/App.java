package mediator;

public class App {

	public static void main(String[] args) {

		Mediador1 mediador1 = new Mediador1();
		ACollega collega1 = new Collega1("c11", mediador1);
		ACollega collega2 = new Collega1("c12", mediador1);
		ACollega collega3 = new Collega2("c23", mediador1);
		ACollega collega4 = new Collega2("c24", mediador1);
		mediador1.collegas.put("c11", collega1);
		mediador1.collegas.put("c12", collega1);
		mediador1.collegas.put("c23", collega3);
		mediador1.collegas.put("c24", collega4);

		Mediador2 mediador2 = new Mediador2();
		ACollega collega5 = new Collega1("c15", mediador2);
		ACollega collega6 = new Collega1("c16", mediador2);
		ACollega collega7 = new Collega2("c27", mediador2);
		ACollega collega8 = new Collega2("c28", mediador2);

		collega1.enviar(new Missatge("Hola c23", "c23"));
		collega3.enviar(new Missatge("Hola c11 que tal? ", "c11"));
		
		mediador1.analitzarConversa();

		collega5.enviar(new Missatge("Hola c28 que tal? ", "c28"));
		collega8.enviar(new Missatge("Hola c15 Bioen i tu?!", "c15"));

	}

}
