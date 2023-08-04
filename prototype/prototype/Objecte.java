package prototype;

public class Objecte implements Cloneable {
	int unInt;
	String UnString;

	public Objecte() {
		super();
	}

	public Objecte(int unInt, String unString) {
		super();
		this.unInt = unInt;
		UnString = unString;
	}

	public int getUnInt() {
		return unInt;
	}

	public void setUnInt(int unInt) {
		this.unInt = unInt;
	}

	public String getUnString() {
		return UnString;
	}

	public void setUnString(String unString) {
		UnString = unString;
	}

	@Override
	public String toString() {
		return "Objecte [unInt=" + unInt + ", UnString=" + UnString + "]";
	}

	@Override
	public Objecte clone() throws CloneNotSupportedException {

		return (Objecte) super.clone();
	}

}
