package mediator;

public class Missatge {
	private String contingut;
	private String remitent;
	private String destinari;

	public Missatge(String contingut, String remitent, String destinari) {
		
		this.contingut = contingut;
		this.remitent = remitent;
		this.destinari = destinari;
	}

	public Missatge(String contingut, String destinari) {
		
		this.contingut = contingut;
		this.destinari = destinari;
	}

	public String getContingut() {
		return contingut;
	}

	public void setContingut(String contingut) {
		this.contingut = contingut;
	}

	public String getRemitent() {
		return remitent;
	}

	public void setRemitent(String remitent) {
		this.remitent = remitent;
	}

	public String getDestinari() {
		return destinari;
	}

	public void setDestinari(String destinari) {
		this.destinari = destinari;
	}

	@Override
	public String toString() {
		return "Missatge [contingut=" + contingut + ", remitent=" + remitent + ", destinari=" + destinari + "]";
	}

}
