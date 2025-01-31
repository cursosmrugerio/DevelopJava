package interfaces;

public interface Cliente {

	// public abstract
	void pagar(double cantidad);

	// public
	static void showCliente() {
		System.out.println("Show Cliente static");
		getCliente();
	}

	// public
	default void mostrarCliente() {
		System.out.println("Mostrar Cliente default");
		getCliente();
		obtenerCliente();
	}

	private static void getCliente() {
		System.out.println("Show Cliente static");
	}
	
	private void obtenerCliente() {
		System.out.println("Mostrar Cliente default");
	}
}
