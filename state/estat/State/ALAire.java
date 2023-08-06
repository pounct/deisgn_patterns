package org.example.categoria.comportament.State;

public class ALAire extends AEstat{
    //Avio avio;

    public ALAire(Avio avio) {
        super(avio);
        //this.avio = avio;
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
        System.out.println("canvi d'estat de l'aire a la pista...");
        this.avio.setEstat(new ALaPista(this.avio));

    }

    @Override
    public void enlairar() {
        System.out.println("ja ets a l'aire!!!");
    }

    @Override
    public void sortidaDelGaratge() {
        System.out.println("impossible sortidaDelGaratge de l'avió, ja esteu a l'aire!!!");

    }

    @Override
    public void entradaAlGaratge() {

        System.out.println("impossible entradaAlGaratge de l'avió, ja esteu a l'aire!!!");
    }

    @Override
    public String toString() {
        return "ALAire{}";
    }
}
