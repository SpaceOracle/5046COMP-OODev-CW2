package auction;

//import java.util.Scanner;

public class Item {

	public Item(){
		
	}
	
	private String description = "Change me";
	
	public String GetDescription(){
		return description;
	}
	
	public void SetDescription(String desc){
		//Scanner cin = new Scanner(System.in);
		
		description = desc;
		
		//cin.close();
	}
}
