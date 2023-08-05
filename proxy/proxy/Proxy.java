package org.example.categoria.estructura.proxy;

public class Proxy implements IAbstraccio {

    private Implementacio implementacio;

    @Override
    public void operacio() {
        ///////////////////////////////////////////
        System.out.println("Verificació exemple : Verificació de les condicions d'accés per part del proxy");//
        //////////////////////////////////////////
        implementacio = new Implementacio();
        implementacio.operacio();
    }
}
