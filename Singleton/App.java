package org.example.categoria.creacio.Singleton;

public class App {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            Singleton singleton = Singleton.getInstance();
            singleton.tractar("T" + i);
        }

        // Aplicació multiprocés i el singleton
        for (int i = 1; i <= 3; i++) {
            ThreadedTask t = new ThreadedTask("T" + i);
            t.start();
        }
    }
}

// ús de sincronitzat synchronized
/*Instanciació
---------- Tasca T1----------
.1.2.3.4.5
Comptador=5
---------- Tasca T2----------
.6.7.8.9.10
Comptador=10
---------- Tasca T3----------
.11.12.13.14.15
Comptador=15
---------- Tasca T1----------
.16.17.18.19.20
Comptador=20
---------- Tasca T3----------
.21.22.23.24.25
Comptador=25
---------- Tasca T2----------
.26.27.28.29.30
Comptador=30

Process finished with exit code 0*/

