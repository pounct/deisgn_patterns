package org.example.categoria.creacio.AbstractFactory;

public class PluginB implements IPlugin{
    @Override
    public void tractament() {
        System.out.println("Processament mitjançant el connector PluginB .....");
    }
}
