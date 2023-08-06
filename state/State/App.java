package org.example.categoria.comportament.State;

public class App {
    public static void main(String[] args) {

        Avio avio1 = new Avio();
        avio1.enlairar();
        avio1.aterrar();
        avio1.entradaAlGaratge();
        avio1.sortidaDelGaratge();

        avio1.aterrar();
        avio1.enlairar();
        avio1.aterrar();
        avio1.entradaAlGaratge();

    }
}
