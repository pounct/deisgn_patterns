package org.example.categoria.comportament.State;

public class Avio {

    private IEstat estat;

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

    public IEstat getEstat() {
        return estat;
    }

    public void setEstat(IEstat estat) {
        this.estat = estat;
    }
}
