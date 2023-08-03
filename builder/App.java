package org.example.categoria.creacio.builder;

public class App {
    public static void main(String[] args) {

        UnaClasse unaClasse = Director.objecteBuilder()
                //UnaClasse unaClasse=UnaClasse.objecteBuilder()
                ///////////////setters o ..../////////////
                .unAtributeClasse("atribute")
                ////////////// instancia finalizada retornar con build()
                .build();

        System.out.println(unaClasse);
    }
}
