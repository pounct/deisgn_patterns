package ingredients;

import begudas.Beguda;

public class Xocolata extends Ingredient {

	public Xocolata(Beguda beguda) {

		super(beguda);
	}

	@Override
	public double preu() {

		return 0.1 + beguda.preu();
	}

	@Override
	public String getDescripcio() {
		return beguda.getDescripcio() + "i xocolata ";
	}

}
