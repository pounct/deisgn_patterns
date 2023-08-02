package org.example.categoria.creacio.AbstractFactory;

public class PluginA implements IPlugin{
    @Override
    public void tractament() {
        System.out.println("Processament mitjançant el connector PluginA .....");
    }
}
