package org.example.categoria.comportament.State;

public class ALaPista implements IEstat{
    Avio avio;

    public ALaPista(Avio avio) {
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
        System.out.println("impossible aterrar l'avió, ja esteu a la pista");

    }

    @Override
    public void enlairar() {
        System.out.println("canvi d'estat de la pista a l'aire...");
        avio.setEstat(new ALAire(avio));

    }

    @Override
    public void sortidaDelGaratge() {
        System.out.println("ja ets a la pista!!!");

    }

    @Override
    public void entradaAlGaratge() {
        System.out.println("canvi d'estat de la pista al garatge ...");
        this.avio.setEstat(new AlGaratge(this.avio));

    }
}
