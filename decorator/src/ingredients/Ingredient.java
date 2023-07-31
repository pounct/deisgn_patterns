package ingredients;

import begudas.Beguda;

public abstract class Ingredient extends Beguda{
	
	protected Beguda beguda;
	
	public Ingredient(Beguda beguda){
		
		this.beguda = beguda;
	}
	
	public abstract String getDescripcio();

}
