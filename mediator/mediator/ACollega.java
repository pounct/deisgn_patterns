package mediator;

public abstract class ACollega {
	protected AMediador mediador;
	protected String nom;

	public ACollega(String nom, AMediador mediador) {
		this.nom=nom;
		this.mediador = mediador;
		mediador.addCollega(nom, this);
	}
	
	
	
	public ACollega() {
	}



	public AMediador getMediador() {
		return mediador;
	}



	public void setMediador(AMediador mediador) {
		this.mediador = mediador;
	}



	public String getNom() {
		return nom;
	}
	
	



	public void setNom(String nom) {
		this.nom = nom;
	}



	public abstract void enviar(Missatge msg);
	public abstract void rebre(Missatge msg);
	

}
