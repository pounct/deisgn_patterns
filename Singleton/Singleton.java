package org.example.categoria.creacio.Singleton;

public class Singleton {
    // final: un cop inicialitzat és definitiu
    private static final Singleton instancia;

    private int comptador;

    // el bloc estàtic s'executa quan es carrega la classe
    static {
        instancia = new Singleton();
    }

    // private constructor s'utilitza a l'interior
    private Singleton() {
        System.out.println("Instanciació");
    }

    public static Singleton getInstance() {
        return instancia;
    }

    public synchronized void tractar(String tasca) {
        System.out.println("---------- Tasca " + tasca + "----------");
        for
        (int i = 1; i <= 5; i++) {

            ++comptador;
            System.out.print("." + comptador);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        System.out.println("Comptador=" + comptador);

    }
}
