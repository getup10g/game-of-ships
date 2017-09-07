package app;
import java.io.Console;
import java.util.Random;
import java.util.Scanner;
import data.PcShip;
import data.PcShoot;
import data.UserShip;
import data.MenuOfShoot;
import data.MenuSetShips;
public class GameOfShips {



	public static void main(String[] args) {
	int x=0,y=0;
	int i=1;
	String a;
	Scanner odczyt = new Scanner(System.in);

	PcShip pc = new PcShip();
	UserShip user = new UserShip();
    MenuOfShoot userShot = new MenuOfShoot(pc);
    MenuSetShips userSet = new MenuSetShips(user);
    PcShoot pcShoot= new PcShoot(user);
//random ships
	pc.RandomSetShips(pc);
// view about User board
	System.out.println("-------------");
	System.out.println("GAME OF SHIPS");
	System.out.println("-------------");
	user.printInfo();
//set a ship
	userSet.Menu(user);	
//copy data from [][] to second [][]
	user.CopyData();
	while(pc.sumOfShips()>0&&user.sumOfShips()>0)
	{
		System.out.println("--------Level " +i+"--------");
// view for a sum of ships
		System.out.println("Stats " +"User Ships:"+ user.sumOfShips()+" "+"PC Ships:"+pc.sumOfShips());	
		userShot.Menu(pc);
		pcShoot.Shoot(user);
		i++;
	}
	if (pc.sumOfShips()==0)
	{
		System.out.println("-------------");
		System.out.println("-------------");
		System.out.println("You lose!");
		System.out.println("-------------");
		System.out.println("-------------");
	}
	else if(user.sumOfShips()==0)
	{
		System.out.println("-------------");
		System.out.println("-------------");
		System.out.println("You win!");
		System.out.println("-------------");
		System.out.println("-------------");
	}
	
	System.out.println("-------------");
	System.out.println("GAME OF SHIPS");
	System.out.println("-------------");
	}
}
