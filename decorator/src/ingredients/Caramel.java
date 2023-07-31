package ingredients;

import begudas.Beguda;

public class Caramel extends Ingredient {

	public Caramel(Beguda beguda) {

		super(beguda);
	}

	@Override
	public double preu() {

		return 0.2 + beguda.preu();
	}

	@Override
	public String getDescripcio() {
		return beguda.getDescripcio() + "i caramel ";
	}

}
