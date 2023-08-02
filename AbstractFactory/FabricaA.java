package org.example.categoria.creacio.AbstractFactory;

public class FabricaA implements IFabrica{
    @Override
    public IPlugin getInstence() {
        return new PluginA();
    }
}
