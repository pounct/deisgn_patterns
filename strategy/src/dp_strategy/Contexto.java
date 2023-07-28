package dp_strategy;

public class Contexto {
	
	private IEstrategia estrategia;
	
	public void proceso() {
		
		System.out.println("etapa 1.........");
		
		
		System.out.println("etapa 2");
		// por ejemplo
		// a este etapa  vemos que necisitamos seleccionar uno de varios
		// algoritmos y no tenemos que escibr esos vaios algoihmo aqui
		// poaa cerrar al escribi y abrir a la  extencion
		// creamos un inteface que grupa toda la familia de esos algoitmos
		// - cada algoithmo encapsulado en una clase
		//
		//
		//
		estrategia.aplicarEstrategia();
		
		System.out.println("etapa 3");
		
	}

	public void setEstrategia(IEstrategia estrategia) {
		this.estrategia = estrategia;
	}
	
	// necisitamos un setter del objeto estrategia que nos sirrve a un momento
	// inyectar el typo de algoritmo a aplica
	//
	//
	

}
