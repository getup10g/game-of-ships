package data;

import java.util.Scanner;

public class UserShip {
		
		Scanner odczyt = new Scanner(System.in);
		private int [][] data1 = new int[4][4];
		private int [][] PcData = new int[4][4];
		private int x;
		private int y;
	    private int ship=7;
		private int sum;


		// settery i gettery
		
		
		public void setShip(int x,int y){
			this.x=x;
			this.y=y;
			this.data1[this.x][this.y]=ship;
			
		}
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
				return data1[this.x][this.y];
			}
		public void setData(int x,int y,int z){
			this.x=x;
			this.y=y;
		  data1[this.x][this.y]=z;
			}
		public void setPcData(int x,int y,int z){
			this.x=x;
			this.y=y;
		  PcData[this.x][this.y]=z;
			}
		
		public void KillShip(int x,int y){
			if (getData(x,y)==7){
				setData(x,y,0);
				setPcData(x,y,2);}
			else{
				setPcData(x,y,1);}
			}
		
		public void CopyData(){
			 for(int i=0;i<4;i++)
			 {
				 PcData[0][i]=data1[0][i];
			 }
			 for(int i=0;i<4;i++)
			 {
				 PcData[1][i]=data1[1][i];
			 }	 
			 for(int i=0;i<4;i++)
			 {
				 PcData[2][i]=data1[2][i];
			 }
			 for(int i=0;i<4;i++)
			 {
				 PcData[3][i]=data1[3][i];
			 }
		}
		
		public int getShip(int x,int y){
			this.x=x;
			this.y=y;
			return PcData[this.x][this.y];
		}
	
		//Konstruktory

		public UserShip(){}
	
		public void printInfo(){
			System.out.println(" "+"|"+"A"+"|"+"B"+"|"+"C"+"|"+"D"+"|");
			System.out.println("1"+"|"+data1[0][0]+"|"+data1[1][0]+"|"+data1[2][0]+"|"+data1[3][0]+"|");
			System.out.println("2"+"|"+data1[0][1]+"|"+data1[1][1]+"|"+data1[2][1]+"|"+data1[3][1]+"|");
			System.out.println("3"+"|"+data1[0][2]+"|"+data1[1][2]+"|"+data1[2][2]+"|"+data1[3][2]+"|");
			System.out.println("4"+"|"+data1[0][3]+"|"+data1[1][3]+"|"+data1[2][3]+"|"+data1[3][3]+"|");
			System.out.println("User Board");
		}
		public void printInfoGame(){
			System.out.println(" "+"|"+"A"+"|"+"B"+"|"+"C"+"|"+"D"+"|");
			System.out.println("1"+"|"+PcData[0][0]+"|"+PcData[1][0]+"|"+PcData[2][0]+"|"+PcData[3][0]+"|");
			System.out.println("2"+"|"+PcData[0][1]+"|"+PcData[1][1]+"|"+PcData[2][1]+"|"+PcData[3][1]+"|");
			System.out.println("3"+"|"+PcData[0][2]+"|"+PcData[1][2]+"|"+PcData[2][2]+"|"+PcData[3][2]+"|");
			System.out.println("4"+"|"+PcData[0][3]+"|"+PcData[1][3]+"|"+PcData[2][3]+"|"+PcData[3][3]+"|");
			System.out.println("\n ");
			System.out.println("User Board :7 - Yours ships,  1 - Computer miss shot, 2 - Computer good shot! ");
			
		}
		}



