package interfaces;

public class ClienteVip implements Cliente{
	
	@Override
	public void pagar(double cantidad) {
		System.out.println("Pagar Cliente");
	}
	
	public static void main(String[] args) {
		Cliente cte = new ClienteVip();
		cte.pagar(30.0);
		
		Cliente.showCliente();
		
		cte.mostrarCliente();
	}
	
	

}
