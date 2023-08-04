package org.example.categoria.comportament.TemplateMethod;

public class App {
    public static void main(String[] args) {
        TemplateClass t1=new Implementacio1();
        System.out.println(t1.operationTemplate());
        t1=new Implementacio2();

        /* Implementation2.java */

        t1=new Implementacio2();
        System.out.println(t1.operationTemplate());

    }
}
