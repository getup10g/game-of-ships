package data;
import java.util.Random;
public class PcShip {
private int [][] data = new int[4][4];
private int [][] userData = new int[4][4];


private int i;
private int j;
private int ship = 7;
private int sumOfChoice;
Random losowanie = new Random();
private	int x=losowanie.nextInt(4);
private	int y=losowanie.nextInt(4);
private	int zmienna=losowanie.nextInt();
int sum;

// settery i gettery
public void setShip(int x,int y){
	this.i=x;
	this.j=y;
	data[this.i][this.j]=ship;	
}
public int sumofChoices(){
	sumOfChoice=0;
	for(int i =0;i<4;i++){
		sumOfChoice+=data[0][i];}
	for(int i =0;i<4;i++){
		sumOfChoice+=data[1][i];}
	for(int i =0;i<4;i++){
		sumOfChoice+=data[2][i];}
	for(int i =0;i<4;i++){
		sumOfChoice+=data[3][i];}	
return sumOfChoice;}

public int sumOfShips(){
	sum=0;
	for(int i =0;i<4;i++){
		sum+=getData(0,i);}
	for(int i =0;i<4;i++){
		sum+=getData(1,i);}
	for(int i =0;i<4;i++){
		sum+=getData(2,i);}
	for(int i =0;i<4;i++){
		sum+=getData(3,i);}	
return sum/7;}

public int getData(int x,int y){
	this.x=x;
	this.y=y;
		return data[this.x][this.y];
	}
public void setData(int x,int y,int z){
	this.x=x;
	this.y=y;
  data[this.x][this.y]=z;
	}
public void setUserData(int x,int y,int z){
	this.x=x;
	this.y=y;
  userData[this.x][this.y]=z;
	}

public void KillShip(int x,int y){
	if (getData(x,y)==7){
		setData(x,y,0);
		setUserData(x,y,2);}
	else{
		setUserData(x,y,1);};
	}


//Konstruktory

public PcShip(){}

public void RandomSetShips(PcShip pc){ 
	
//Losowanie 4 statków 
x=losowanie.nextInt(4);
y=losowanie.nextInt(4);
setShip(x, y);
	 do{
	 zmienna=losowanie.nextInt();
	    if(zmienna==0) //Funkcje na dodawanie
	    {
	        	if (x==0&&y==3)
	        	{
	            	   setShip(x++,y);
	        	}
	        	else if(x==0&&y<3)
	        	{
	            	   zmienna=losowanie.nextInt();
	            	   if(zmienna==0)
	            		   setShip(x,y++); 
	            	   else 
	            		   setShip(x++,y); 
	        	}
	        	else if(x==0&&y==0)
	           	{
	          	   zmienna=losowanie.nextInt();
	          	   if(zmienna==0)
	          		   setShip(x,y++); 
	          	   else 
	          		   setShip(x++,y); 
	           	}
	        	else if (x==1&&y==3)
	        	{
	        	   setShip(x++,y);
	        	}
	           else if(x==1&&y<3)
	         	{
	        	   zmienna=losowanie.nextInt();
	        	   if(zmienna==0)
	        		   setShip(x,y++); 
	        	   else 
	        		  setShip(x++,y); 
	         	}
	           else if(x==2&&y==3) 
	           {
	        		setShip(x++,y);
	           }
	           else if(x==2&&y<3)
	           	{
	         	   zmienna=losowanie.nextInt();
	         	   if(zmienna==0)
	         		   setShip(x,y++); 
	         	   else 
	         		   setShip(x++,y); 
	           	}
	           else if(x==3&&y<3)
	        	{
	        	   zmienna=losowanie.nextInt();
	       	   if(zmienna==0)
	       		   setShip(x,y++); 
	       	   else 
	       		   setShip(x--,y); 
	        	}
	          else if(x==3&&y==3) 
	       		{
	       			setShip(x--,y--);
	       		} 
	    }
	else  // Funkcje na odejmowanie
	    {
	        if (x==0&&y==3)
	        {
	        	setShip(x,y--);
	        }
	      	else if(x==0&&y==0)
	        {
	      		zmienna=losowanie.nextInt();
	      		if(zmienna==0)
	      			setShip(x,y++); 
	      		else 
	      			setShip(x++,y); 
	        }
	      	else if(x==0&&y>=1)
	       	{
	      		zmienna=losowanie.nextInt();
	      		if(zmienna==0)
	      			setShip(x,y--); 
	      		else 
	      			setShip(x++,y); 
	       	}
	      	if (x==1&&y==3)
	      	{
	      		zmienna=losowanie.nextInt();
	       	   if(zmienna==0)
	       		   setShip(x,y--); 
	       	   else 
	       		   setShip(x--,y); 	        		
	      	}
	        else if(x==1&&y<3)
	       	{
	      	   zmienna=losowanie.nextInt();
	      	   if(zmienna==0)
	      	   setShip(x,y++); 
	      	   else 
	      		   setShip(x++,y); 
	       	}
	         else if(x==2&&y==3) 
	      		{
	      		setShip(x--,y);
	      		}
	         else if(x==2&&y<3)
	         	{
	       	   zmienna=losowanie.nextInt();
	       	   if(zmienna==0)
	       		   if(y==0)
	       			   setShip(x,y++);
	       		   else
	       			  setShip(x,y--);
	       	   else 
	       		   setShip(x--,y); 
	         	}
	         else if(x==3&&y<3)
	      		{
	         zmienna=losowanie.nextInt();
	         		if(zmienna==0)
	         			if(y==0)
	         				setShip(x,y++);
	         			else
	         				setShip(x,y--);
	         		else 
	         			setShip(x--,y); 
	      		}
	         else if(x==3&&y==3) 
	         {
	        	 setShip(x--,y--);
	         }

	  }   
	    x=losowanie.nextInt(4);
	    y=losowanie.nextInt(4);
}
while(sumofChoices()<42);			
	    }

public void printPcInfo(){
	System.out.println(" "+"|"+"A"+"|"+"B"+"|"+"C"+"|"+"D"+"|");
	System.out.println("1"+"|"+data[0][0]+"|"+data[1][0]+"|"+data[2][0]+"|"+data[3][0]+"|");
	System.out.println("2"+"|"+data[0][1]+"|"+data[1][1]+"|"+data[2][1]+"|"+data[3][1]+"|");
	System.out.println("3"+"|"+data[0][2]+"|"+data[1][2]+"|"+data[2][2]+"|"+data[3][2]+"|");
	System.out.println("4"+"|"+data[0][3]+"|"+data[1][3]+"|"+data[2][3]+"|"+data[3][3]+"|");
	
	System.out.println("PC Board GameMaster View ");
}
public void printUserInfo(){
	System.out.println(" "+"|"+"A"+"|"+"B"+"|"+"C"+"|"+"D"+"|");
	System.out.println("1"+"|"+userData[0][0]+"|"+userData[1][0]+"|"+userData[2][0]+"|"+userData[3][0]+"|");
	System.out.println("2"+"|"+userData[0][1]+"|"+userData[1][1]+"|"+userData[2][1]+"|"+userData[3][1]+"|");
	System.out.println("3"+"|"+userData[0][2]+"|"+userData[1][2]+"|"+userData[2][2]+"|"+userData[3][2]+"|");
	System.out.println("4"+"|"+userData[0][3]+"|"+userData[1][3]+"|"+userData[2][3]+"|"+userData[3][3]+"|");
	
	System.out.println("PC Board User View : 1- miss shot, 2 - Good shot! ");
}
}

