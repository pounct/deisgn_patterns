package org.example.categoria.comportament.command;

public class Receptor2 implements IReceptor {

    // Accions del receptor
    // cada acció correspon a una ordre invocada per un client
    public void accio1() {

        System.out.println("Acció 1 del Receptor2");
    }

    public void accio2() {

        System.out.println("Acció 2 del Receptor2");
    }

    public void accio3() {

        System.out.println("Acció 3 del Receptor2");
    }
}
