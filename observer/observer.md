<h1>El patró observador</h1>

<h2>Categoria: Comportament</h2>

<h2>Definició:</h2>
<p></p>◦ El patró observador defineix una relació entre un a molts objectes, de de manera que quan un objecte canvia d'estat,tots els que en depenen estan informats i s'actualitzen automàticament.</p


<h2>Diagrama de classes</h2>

<img src = "https://github.com/pounct/deisgn_patterns/assets/53088375/d37306ae-cc73-41c1-a608-d626a5a1c176"/>



<h2>Implementació</h2>
  <h3>El diagrama UML del patró Observer defineix dues interfícies i dues classes.</h3>
<h3>◦ La interfície Observer serà implementada per totes les classes que vulguin tenir el paper d'observador.</h3>
<h3>◦ Aquest és el cas de la classe ConcreteObserver que imlementa el mètode actualize(Observable).</h3>
<h3>Aquest mètode es cridarà automàticament quan a canvi d'estat de la classe observada.</h3>
<h3>◦ També hi ha una interfície Observable que han de ser implementades per les classes que vulguin tenir observadors.</h3>
<h3>◦ La classe ObservableConcret implementa aquesta interfície, que li permet mantenir informats els seus observadors.</h3>
<h3>Això té com a atribut un estat (o diversos) i una matriu d'observadors.</h3>
<h3>L'estat és un atribut els observadors del qual volen seguir l'evolució dels seus valors.</h3>
<h3>La matriu d'observadors és la llista d'observadors que estan escoltant.</h3>
<h3>◦ De fet, no n'hi ha prou que una classe implementi la interfície Observer per estar escoltant, s'ha de subscriure a un Observable mitjançant el mètode addObserver(Observer).</h3>

<p>Hi ha variacions possibles quan s'utilitza aquest patró.
◦ DIBUIXAR: En la solució presentada, es posa a disposició de cada observador una referència a l'objecte observable. Així, els observadors poden utilitzar-lo per cridar el mètode getState() i així obtenir l'estat de l'observable. Aquesta solució s'anomena "DRAW" perquè correspon als observadors, un cop informats de l'evolució, buscar informació sobre l'estat.
◦ PUSH: Però hi ha la solució oposada anomenada “PUSH”.
En aquest cas, passem l'estat actual de l'observable directament al mètode actualize(TypeState). Així, els observadors tenen accés directe a l'estat.
  Quina és la millor solució entre les dues? És el primer perquè permet una vegada més vincular feblement l'observable amb els seus observadors. De fet, si l'observador té un punter a l'objecte observable i la classe observable evoluciona afegint un segon estat. L'observador que vulgui mantenir-se informat d'aquest segon estat només haurà de trucar a l'accessor corresponent. Mentre que si "PUSH" caldria canviar la signatura del mètode que pot resultar més perjudicial.</p>
<p>
El patró d'observador (un subconjunt del patró de publicació/subscripció asíncron) és un patró de disseny de programari en el qual un objecte, anomenat subjecte, manté una llista dels seus dependents, anomenats observadors, i els notifica automàticament de qualsevol canvi d'estat, generalment trucant.  un dels seus mètodes.  S'utilitza principalment per implementar sistemes de gestió d'esdeveniments distribuïts.
</p>





