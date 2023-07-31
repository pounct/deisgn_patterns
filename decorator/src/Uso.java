import begudas.Beguda;
import begudas.Espresso;
import ingredients.Xarop;
import ingredients.Xocolata;

public class Uso {

	public static void main(String[] args) {

		System.out.println("-------------- Espresso -----------------");
		Beguda esp = new Espresso();
		System.err.println(esp.getDescripcio());
		System.out.println(esp.preu());
		System.out.println("-------------- Espresso -----------------");
		System.out.println("-------------- i Xocolata ---------------");
		esp = new Xocolata(esp);
		System.err.println(esp.getDescripcio());
		System.out.println(esp.preu());
		System.out.println("-------------- Espresso -----------------");
		System.out.println("-------------- i Xocolata i Xarop---------------");
		esp = new Xarop(esp);
		System.err.println(esp.getDescripcio());
		System.out.println(esp.preu());
	}

}
