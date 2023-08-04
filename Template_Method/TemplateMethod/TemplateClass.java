package org.example.categoria.comportament.TemplateMethod;

public abstract class TemplateClass {
    public int operationTemplate() {
        int a = operacioAbs1();
        int somme = 0;
        /*
        TemplateClass.java
        */

        for
        (int i = 0; i < a; i++) {
            somme += operacioAbs2();
        }
        return somme;
    }

    protected abstract int operacioAbs1();

    protected abstract int operacioAbs2();
}
