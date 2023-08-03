Patró Proxy

  Categoria:
◦ Estructura
  Propòsit del patró
◦ Proporcionar un intermediari entre la part client i un objecte per controlar l'accés a aquesta última.
  Resultat:
◦ El patró de disseny ajuda a aïllar el comportament quan s'accedeix a un objecte.

Diagrama de classes i seqüències UML


![image](https://github.com/pounct/deisgn_patterns/assets/53088375/ba06adb4-1669-49c0-89cd-7fe993370696)

Motiu d'ús

  Les operacions amb objectes requereixen temps o
estan subjectes a la gestió dels drets d'accés.
  És necessari controlar l'accés a un objecte.
  Aquest pot ser un sistema de càrrega de documents.
El document és molt pesat per carregar a la memòria o aquesta
requereix determinades autoritzacions per accedir a aquest document.
  L'objecte real (sistema de càrrega clàssic) és
la implementació. L'intermediari entre la implementació i la part del client és el proxy.
  El proxy proporciona la mateixa interfície que la implementació.
Però només carrega el document en cas de necessitat real (per a la visualització per exemple) o n'autoritza l'accés només si es compleixen les condicions.

Responsabilitats
  Abstracció: defineix la interfície de les classes Implementacio i Proxy.
  Implementació: implementa la interfície. Aquesta classe defineix l'objecte que representa l'objecte Proxy.
  Proxy: proporciona un intermediari entre la part del client i l'objecte d'implementació. Aquest intermediari pot tenir diverses finalitats (sincronització, control d'accés, memòria cau, accés remot, ...). A l'exemple, la classe Proxy crea una instancia d'un objecte d'implementació només quan cal cridar el mètode corresponent de la classe d'implementació.
  La part del client crida al mètode operation() de l'objecte Proxy.

  
![Sans titre](https://github.com/pounct/deisgn_patterns/assets/53088375/1c54926b-b845-4e01-8a5a-42e6f1f8e01a)

  
