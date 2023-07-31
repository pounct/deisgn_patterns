El patró observador

Categoria: Comportament

Definició:
◦ El patró observador defineix una relació entre un a molts objectes, de de manera que quan un objecte canvia d'estat,tots els que en depenen estan informats i s'actualitzen automàticament.


Diagrama de classes

<img src = "https://github.com/pounct/deisgn_patterns/assets/53088375/d37306ae-cc73-41c1-a608-d626a5a1c176"/>



Implementació
  El diagrama UML del patró Observer defineix dues interfícies i dues classes.
◦ La interfície Observer serà implementada per totes les classes que vulguin tenir el paper d'observador.
◦ Aquest és el cas de la classe ConcreteObserver que imlementa el mètode actualize(Observable).
Aquest mètode es cridarà automàticament quan a canvi d'estat de la classe observada.
◦ També hi ha una interfície Observable que han de ser implementades per les classes que vulguin tenir observadors.
◦ La classe ObservableConcret implementa aquesta interfície, que li permet mantenir informats els seus observadors.
Això té com a atribut un estat (o diversos) i una matriu d'observadors.
L'estat és un atribut els observadors del qual volen seguir l'evolució dels seus valors.
La matriu d'observadors és la llista d'observadors que estan escoltant.
◦ De fet, no n'hi ha prou que una classe implementi la interfície Observer per estar escoltant, s'ha de subscriure a un Observable mitjançant el mètode addObserver(Observer).





