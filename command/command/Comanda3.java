package org.example.categoria.comportament.command;

public class Comanda3 implements IComanda {
    private Receptor2 receptor;

    public Comanda3(Receptor2 receptor) {
        this.receptor = receptor;
    }

    @Override
    public void executar() {
        receptor.accio1();// Comanda3 -----> Receptor2 ---> Accio1

    }
}
