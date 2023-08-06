package org.example.categoria.comportament.State;

public abstract class AEstat {
    protected Avio avio;

    public AEstat(Avio avio) {
        this.avio=avio;
    }


    abstract void operacioEstatA();

    abstract void operacioEstatB();

    abstract void operacioEstatC();

    abstract void ferAccio();

    abstract void aterrar();

    abstract void enlairar();

    abstract void sortidaDelGaratge();

    abstract void entradaAlGaratge();

    @Override
    public String toString() {
        return "AEstat{" +
                "avio=" + avio +
                '}';
    }
}
