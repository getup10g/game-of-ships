package data;

import java.util.Scanner;

public class MenuSetShips {
		
	public MenuSetShips(UserShip user) {
		
	}

	public void Menu(UserShip user) {
		int x=0,y=0;
		String a;
		Scanner odczyt = new Scanner(System.in);
		for(int i=0;i<=5;i++)
		{
			System.out.println("Set Your ship, write the column letter and a digit line");
			
			System.out.println("\n");
			a = odczyt.next();				
			y=odczyt.nextInt();
			y--;
			switch(a){
			case "a":
				x=0;
				break;
			case "b":
				x=1;
				break;
			case "c":
				x=2;
				break;
			case "d":
				x=3;
				break;
			}
		
	user.setShip(x, y);
	user.printInfo();
	System.out.println("\n");
	
		}
		
	}


	
}
