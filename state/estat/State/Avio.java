package org.example.categoria.comportament.State;

public class Avio {

    private AEstat estat;

    public Avio() {
        estat = new AlGaratge(this);
    }

    public void aterrar() {
        estat.aterrar();
    }

    public void enlairar() {
        estat.enlairar();
    }

    public void sortidaDelGaratge() {
        estat.sortidaDelGaratge();
    }

    public void entradaAlGaratge() {
        estat.entradaAlGaratge();
    }

    public AEstat getEstat() {
        return estat;
    }

    public void setEstat(AEstat estat) {
        this.estat = estat;
    }
}
