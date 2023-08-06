package org.example.categoria.comportament.State;

public class ClasseAmbEstat extends Avio{

    private IEstat estat;

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

    public IEstat getEstat() {
        return estat;
    }

    public void setEstat(IEstat estat) {
        this.estat = estat;
    }
}
