package mediator;

import java.util.HashMap;
import java.util.Map;

public abstract class AMediador {

	protected Map<String, ACollega> collegas = new HashMap<String, ACollega>();

	public void addCollega(String nom, ACollega clg) {

		collegas.put(nom, clg);
	}

	public abstract void transmetreMissatge(Missatge msg);

}
