package org.example.categoria.comportament.command;

public class Comanda1 implements IComanda {
    private Receptor1 receptor;

    public Comanda1(Receptor1 receptor) {
        this.receptor = receptor;
    }

    @Override
    public void executar() {
        receptor.accio1();// Comanda1 ---> Accio1

    }
}
