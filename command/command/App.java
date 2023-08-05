package org.example.categoria.comportament.command;

public class App {
    public static void main(String[] args) {

        Receptor1 rec1 = new Receptor1();
        Receptor2 rec2 = new Receptor2();

        IComanda cmd1 = new Comanda1(rec1);
        IComanda cmd2 = new Comanda2(rec1);
        IComanda cmd3 = new Comanda3(rec2);

        Invocador invocador = new Invocador();

        invocador.addComanda("cmd1", cmd1);
        invocador.addComanda("cmd2", cmd2);
        invocador.addComanda("cmd3", cmd3);

        invocador.invocarComanda("cmd1");
        invocador.invocarComanda("cmd2");
        invocador.invocarComanda("cmd3");


    }
}
