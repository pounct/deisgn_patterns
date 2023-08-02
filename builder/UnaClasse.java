package org.example.categoria.creacio.builder;

public class UnaClasse {
    @Override
    public String toString() {
        return "UnaClasse{" +
                "unAtribut='" + unAtribut + '\'' +
                '}';
    }

    private String unAtribut;
    public void setUnAtribut(String unAtribut) {
        this.unAtribut = unAtribut;
    }

    public String getUnAtribut() {
        return unAtribut;
    }

    public static ObjecteBuilder builder(){

        return new ObjecteBuilder();
    }

    // classe interna para objecte builder
    public static class ObjecteBuilder {
        private final UnaClasse unaClasse=new UnaClasse();

        public ObjecteBuilder unAtributeClasse(String unString) {
            unaClasse.setUnAtribut(unString);
            return this;
        }
        /////////////////////////////////
        // al final de setters retornem un objecte de typo la classe a instanciar
        // con el metode build
        public UnaClasse build(){
            return this.unaClasse;
        }
    }
}
