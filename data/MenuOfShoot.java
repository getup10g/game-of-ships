package data;



import java.util.Scanner;

import data.PcShip;
public class MenuOfShoot {


	public MenuOfShoot(PcShip pc) {
		// TODO Auto-generated constructor stub
	}

	public void Menu(PcShip pc){
		Scanner odczyt = new Scanner(System.in);		
		int x = 0;
		int y;
		String a;
		    System.out.println("\n");
			
			System.out.println("Choose Your shoot, writhe the column letter and a digit line");
			pc.printUserInfo();
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
		
	pc.KillShip(x, y);
	pc.printUserInfo();
	System.out.println("\n");
			
		
	}
}
