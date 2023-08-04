package prototype;

public class App {

	public static void main(String[] args) throws CloneNotSupportedException {
		AClonar aClonar = new AClonar("valueStringCl", 34, new Objecte(67, "valueStringOb"));
		AClonar copia1 = aClonar.clone();
		AClonar copia2 = aClonar.clone();

		copia1.setUnString("modificado");
		copia1.getObjecte().setUnString("Objecte modificat");
		System.out.println(copia1);
		System.out.println(copia2);

	}

}
