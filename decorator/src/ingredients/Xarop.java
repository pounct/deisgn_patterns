package ingredients;

import begudas.Beguda;

public class Xarop extends Ingredient {

	public Xarop(Beguda beguda) {

		super(beguda);
	}

	@Override
	public double preu() {

		return 0.3 + beguda.preu();
	}

	@Override
	public String getDescripcio() {
		return beguda.getDescripcio() + "i xarop ";
	}

}
