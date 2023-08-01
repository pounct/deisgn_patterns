package org.example.categoria.estructura.compost;

public class App {
    public static void main(String[] args) {
        Directori root = new Directori("patterns");

        Directori d1 = new Directori("strategy");
        Directori d2 = new Directori("decorator");

        Fitxer f1 = new Fitxer("notas.txt");
        Fitxer f2 = new Fitxer("programa.java");
        Fitxer f3 = new Fitxer("presentacio.html");

        root.addComponent(f1);
        root.addComponent(d1);
        root.addComponent(d2);

        d1.addComponent(f2);
        d2.addComponent(f3);

        root.mostrar();
    }
}
