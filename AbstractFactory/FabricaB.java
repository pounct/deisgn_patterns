package org.example.categoria.creacio.AbstractFactory;

public class FabricaB implements IFabrica{
    @Override
    public IPlugin getInstence() {
        return new PluginB();
    }
}
