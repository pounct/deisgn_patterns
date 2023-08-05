package org.example.categoria.comportament.command;

public class Receptor1 implements IReceptor{


    // Accions del receptor
    // cada acció correspon a una ordre invocada per un client
    public void accio1() {

        System.out.println("Acció 1 del Receptor1");
    }

    public void accio2() {

        System.out.println("Acció 2 del Receptor1");
    }
}
