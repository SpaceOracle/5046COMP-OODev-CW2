package auction;

import java.util.Scanner;

public class Item {

	public Item(){
		
	}
	
	private String description;
	
	public String GetDescription(){
		return description;
	}
	
	public void SetDescription(){
		Scanner cin = new Scanner(System.in);
		
		description = cin.next();
		
		cin.close();
	}
}
