package org.example.categoria.creacio.builder;

public class App {
    public static void main(String[] args) {
        UnaClasse unaClasse=UnaClasse.builder()
                ///////////////setters o ..../////////////
                .unAtributeClasse("tipo de atribute")
                ////////////// instancia preparada retornar con build()
                .build();

        System.out.println(unaClasse);
    }
}
