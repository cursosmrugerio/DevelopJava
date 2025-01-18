package bloques;

class Estudiante{
	int x = 5;
	
	{
		System.out.println("Bloque instancia 1");
		int x = 10;
	}
	
	public Estudiante() {
		System.out.println("Paso por Constructor 1");
		{
			System.out.println("Paso por Constructor 2");
		}
	}
	
	{
		System.out.println("Bloque instancia 2");
	}
	
}

//Bloques Instancia
//Constructor

public class Principal {

	public static void main(String[] args) {
		Estudiante e1 = new Estudiante();
		Estudiante e2 = new Estudiante();
	}

}
