<h1>El patró estat:</h1>

  <h3>El comportament dels mètodes d'un objecte sovint depèn del seu estat.</h3>
  <h3>Aquest estat es representa generalment pels atributs de l'objecte.</h3>
  <h3>Tanmateix, com més l'objecte pot adoptar diferents estats de comportament, més complexa serà l'estructuració de l'objecte.</h3>
  <h3>El patró de disseny "estat" és la millor solució per estructurar i representar correctament els diferents estats d'un objecte així com les transicions entre aquests estats en una forma orientada a objectes.</h3>

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
