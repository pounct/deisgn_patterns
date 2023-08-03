package org.example.categoria.creacio.Singleton;

/*
* Aplicació multiprocés i el singleton

  En una aplicació multifils, el fet que diversos fils fan servir un singleton, can
  provocar problemes de sincronització.
  Per evitar el problema, els mètodes de la singleton es pot declarar sincronitzat.
  Això condueix a la creació d'una cua pel que fa a l'accés a aquests mètodes.
  Això dificulta el rendiment de l'aplicació.
  * */
public class ThreadedTask extends Thread {
    private String taskName;

    public ThreadedTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance();
        singleton.tractar(taskName);
    }
}
