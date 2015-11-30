
public class DragonDriver {
	public static void main(String args[]){
		
		Dragon johnny = new Dragon("yellow", "fire", 6);
		Dragon jennifer = new Dragon("violet", "ice", 5);
		Dragon gary = new Dragon("blue", "electricty", 7);
		
		System.out.println("Johnny: " + johnny.toString());
		System.out.println("Jennifer: " + jennifer.toString());
		System.out.println("Gary: " + gary.toString());
		
		johnny.setColor("black");
		jennifer.setAbility("flowers");
		gary.setSize(9);
		
		System.out.println("----------------------");
		
		System.out.println("Johnny: " + johnny.toString());
		System.out.println("Jennifer: " + jennifer.toString());
		System.out.println("Gary: " + gary.toString());
	}
}
