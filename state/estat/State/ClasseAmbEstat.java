package org.example.categoria.comportament.State;

public class ClasseAmbEstat extends Avio{

    private AEstat estat;

    public ClasseAmbEstat() {
        estat = new EstatA(this);
    }

    public void operacioEstatA() {
        estat.operacioEstatA();
    }

    public void operacioEstatB() {
        estat.operacioEstatB();
    }

    public void operacioEstatC() {
        estat.operacioEstatC();
    }

    public void ferAccio() {
        estat.ferAccio();
    }

    public AEstat getEstat() {
        return estat;
    }

    public void setEstat(AEstat estat) {
        this.estat = estat;
    }
}
