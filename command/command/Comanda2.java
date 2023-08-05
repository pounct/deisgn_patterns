package org.example.categoria.comportament.command;

public class Comanda2 implements IComanda {
    private Receptor1 receptor;

    public Comanda2(Receptor1 receptor) {
        this.receptor = receptor;
    }

    @Override
    public void executar() {
        receptor.accio2();// Comanda2 ---> Receptor1 ---> Accio2

    }
}
