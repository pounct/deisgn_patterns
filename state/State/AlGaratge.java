package org.example.categoria.comportament.State;

public class AlGaratge implements IEstat{
    Avio avio;//=new Avio()

    public AlGaratge(Avio avio) {
        this.avio = avio;
    }

    @Override
    public void operacioEstatA() {

    }

    @Override
    public void operacioEstatB() {

    }

    @Override
    public void operacioEstatC() {

    }

    @Override
    public void ferAccio() {

    }

    @Override
    public void aterrar() {
        System.out.println("impossible aterrar l'avió, ja esteu al garatge");

    }

    @Override
    public void enlairar() {
        System.out.println("impossible enlairar l'avió, ja esteu al garatge");

    }

    @Override
    public void sortidaDelGaratge() {
        System.out.println("canvi d'estat del garatge a la pista ...");
        this.avio.setEstat(new ALaPista(this.avio));

    }

    @Override
    public void entradaAlGaratge() {
        System.out.println("ja ets al garatge!!!");


    }
}
