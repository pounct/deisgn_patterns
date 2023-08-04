package prototype;

public class AClonar implements Cloneable {

	String UnString;
	int unInt;
	Objecte objecte;

	public String getUnString() {
		return UnString;
	}

	public void setUnString(String unString) {
		UnString = unString;
	}

	public int getUnInt() {
		return unInt;
	}

	public void setUnInt(int unInt) {
		this.unInt = unInt;
	}

	public Objecte getObjecte() {
		return objecte;
	}

	public void setObjecte(Objecte objecte) {
		this.objecte = objecte;
	}

	public AClonar(String unString, int unInt, Objecte objecte) {
		super();
		UnString = unString;
		this.unInt = unInt;
		this.objecte = objecte;
	}

	public AClonar() {
		super();
	}

	@Override
	public String toString() {
		return "AClonar [UnString=" + UnString + ", unInt=" + unInt + ", objecte=" + objecte + "]";
	}

	@Override
	public AClonar clone() throws CloneNotSupportedException {
		AClonar aClonar = (AClonar) super.clone();
		aClonar.setObjecte(this.objecte.clone());
		return aClonar;
	}

}
