package com.curso.v5;

//NO PUEDE SER INSTANCIADA
//abstract
public interface Operacion{ //extends Object { //NO hereda Object
	
	//public static final
//	int x=10;
//	int y=5;
	
//	public Operacion(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}

	//public abstract
	int ejecuta();

	//Java 1-7: Métodos abstract
	//Java 8: Métodos con comportamiento
	//        static o default
	//Java 9: private (comportamiento) / static private
	
//	public String toString() {
//		return this.getClass().getSimpleName()+
//				"[x=" + x + ", y=" + y + "]";
//	}

}
