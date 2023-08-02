package org.example.categoria.creacio.AbstractFactory;

public class App {
    public static void main(String[] args) {
        // Instanciació estàtica de la fàbrica
        IFabrica fabrica = new FabricaA();
        IPlugin plugin = fabrica.getInstence();
        plugin.tractament();
        // Instanciació dinàmica de la fàbrica
        try {
            fabrica = (IFabrica) Class.forName("org.example.categoria.creacio.AbstractFactory.FabricaB").newInstance();
            plugin = fabrica.getInstence();
            plugin.tractament();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
