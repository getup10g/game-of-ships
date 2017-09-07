package data;
import java.util.Random;
public class PcShoot {
public PcShoot(UserShip user){
}
public void Shoot(UserShip user){
	int x=0;
	int y=0;
Random losowanie = new Random();

System.out.println("--");
System.out.println("Computer shoot");
System.out.println("--");
do{
	x=losowanie.nextInt(4);
	y=losowanie.nextInt(4);
}
while(user.getShip(x,y)==6||user.getShip(x,y)==1);
user.KillShip(x,y);
user.printInfoGame();

	
}
}


