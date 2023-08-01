package org.example.categoria.estructura.compost;

public class Fitxer extends Component {

    public Fitxer(String name) {
        super(name);
    }

    @Override
    public void mostrar() {

        System.out.println(indexacio()+"Fitxer: "+name);


    }
}
