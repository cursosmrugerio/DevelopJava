package employee;

public class WaterFiller2 {
	
	public static void main(String[] args) {
		aquarium.jellies.Water water1 = new aquarium.jellies.Water(); //aquarium.jellies
		System.out.println(water1.salty); //true
		
		aquarium.Water water2 = new aquarium.Water(); //aquarium
		System.out.println(water2.salty); //false
	}
	
}
