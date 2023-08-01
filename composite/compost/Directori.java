package org.example.categoria.estructura.compost;

import java.util.ArrayList;
import java.util.List;

public class Directori extends Component{

    private List<Component> components = new ArrayList<>();
    public Directori(String name) {
        super(name);
    }

    @Override
    public void mostrar() {

        System.out.println(indexacio()+"Directori: "+name);
        for (Component c:components ) {
            c.mostrar();
        }

    }
    public void addComponent(Component component){
        component.nivell = this.nivell + 1 ;
        this.components.add(component);
    }
}
