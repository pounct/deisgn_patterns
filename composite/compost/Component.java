package org.example.categoria.estructura.compost;

public abstract class Component {

    protected String name;
    protected int nivell;

    public String getName() {
        return name;
    }

    public Component(String name) {
        this.name = name;
    }

    public abstract void mostrar();

    public String indexacio(){
        String str="";
        for (int i=0;i<nivell;i++){
            str+="\t";
        }
        return str;
    }


}
