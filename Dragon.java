import java.util.Scanner;

public class Dragon {
	private String color;
	private String ability;
	private int size;
	
	public Dragon(){
		this("red", "fire", 3);
	}
	public Dragon(String c, String a, int s){
		setColor(c);
		setAbility(a);
		setSize(s);
	}
	public void setColor(String c){
		color = c;
	}
	public void setAbility(String a){
		ability = a;
	}
	public void setSize(int s){
		size = s;
	}
	public String getColor(){
		return color;
	}
	public String getAbility(){
		return ability;
	}
	public int getSize(){
		return size;
	}
	public String toString(){
		return "\nColor:" + color +
				"\nAbility:" + ability +
				"\nSize:" + size;
	}
}
