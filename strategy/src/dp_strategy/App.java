package dp_strategy;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Contexto ctx = new Contexto();

		// ejemplo con instancia estatica
		ctx.setEstrategia(new Estrategia1());
		ctx.proceso();

		ctx.setEstrategia(new Estrategia2());
		ctx.proceso();

		ctx.setEstrategia(new Estrategia3());
		ctx.proceso();

		// ejemplo con intancia dynamica
		Scanner sc = new Scanner(System.in);
		boolean fin = false;

		// ex :  dp_strategy.Estrategia1
		System.out.println("el nombre de la strategia (clase) a usar:");
		String nombreClaseEstategia = sc.nextLine();

		try {
			IEstrategia estrategia = (IEstrategia) Class.forName(nombreClaseEstategia).newInstance();
			ctx.setEstrategia(estrategia);
			ctx.proceso();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
