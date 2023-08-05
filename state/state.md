<h1>El patró estat:</h1>

  <h3>El comportament dels mètodes d'un objecte sovint depèn del seu estat.</h3>
  <h3>Aquest estat es representa generalment pels atributs de l'objecte.</h3>
  <h3>Tanmateix, com més l'objecte pot adoptar diferents estats de comportament, més complexa serà l'estructuració de l'objecte.</h3>
  <h3>El patró de disseny "estat" és la millor solució per estructurar i representar correctament els diferents estats d'un objecte així com les transicions entre aquests estats en una forma orientada a objectes.</h3>

  <h3>Categoria:</h3>
<h4>◦ Comportament</h4>
  <h3>Propòsit del patró</h3>
<h4>◦ Canviar el comportament d'un objecte en funció del seu estat intern.</h4>
  <h3>Resultat:</h3>
<h4>◦ El patró de disseny permet aïllar els algorismes específics de cada estat d'un objecte.</h4>

![image](https://github.com/pounct/deisgn_patterns/assets/53088375/910a7483-e335-4062-bff8-0d600e09ff11)


<h2>Problema exemple</h2>

<h3>• Una aeronau pot estar en un dels tres estats:</h3>
<h3>• ja sigui al garatge,</h3>
<h3>• ja sigui a la pista,</h3>
<h3>• ja sigui a l'aire.</h3>
<h3>• Quan es troba al garatge, el mètode de sortida del garatge permet passar en l'estat “a la pista”.</h3>
<h3>• Quan a la pista, el mètode d'entrada al garatge us permet entrar a l'estat "al garatge".</h3>
<h3>• El mètode d'enlairament permet passar a l'estat "a l'aire".</h3>
<h3>• Quan està a l'aire, el mètode d'aterratge permet entrar a l'estat “a la pista”.</h3>
<h3>• Les combinacions d'altres estats - mètodes generen un error, per exemple, invocant l'enlairament quan l'avió està al garatge.</h3>

<p>
  Motiu d'ús

  Un objecte té un funcionament diferent segons el seu estat intern.
El seu estat canvia segons els mètodes anomenats.
Pot ser un document informàtic.
Té les funcions d'obrir, modificar, guardar o tancar.
El comportament d'aquests mètodes canvia en funció de l'estat del document.
Els diferents estats interns estan representats cadascun per una classe d'estat (obert, modificat, desat i tancat).
Els informes tenen mètodes per dur a terme operacions i canviar d'estat (obrir, modificar, desar i
Tanca).
Alguns estats bloquegen determinades operacions (editar en
estat tancat).
L'objecte amb estat manté una referència a l'estat actual.
Presenta les operacions a la part del client.
</p>
<h3>Responsabilitats</h3>
  <li>Classe amb estat: és una classe amb estat. El seu comportament canvia en funció de la seva condició. La part canviant del seu comportament es delega a un objecte d'estat.</li>
  <li>Estat: defineix la interfície del comportament d'un estat.</li>
  <li>Estat A, Estat B i Estat C: són subclasses concretes classes concretes de la interfície Estat. Implementen mètodes associats a un Estat.</li>
