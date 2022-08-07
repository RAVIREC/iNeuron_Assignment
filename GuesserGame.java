import java.util.*;

class Guesser {
	int g;
	public int guessMethod() {
		System.out.print("Guesser please guess the number : ");
		Scanner sc= new Scanner(System.in);
		g=sc.nextInt();
		 if(g <10) {
			  
		   }
		   else {
			   System.out.println("Please guess the number below 10");
		   System.out.print("Sorry Please Restart the game");
	  	 System.exit(0);
		   }   
		return g;
	}	
}
class Player{
	int p;
static	int count=0;
     public int playerMethod() {
    	
    	 Scanner sc= new Scanner(System.in);
    	System.out.println("Guess the number from player"+ ++count);
    
    	 int p= sc.nextInt();
    	 
    	 return p;
     }	 
}
class Umpire  {
	int g1fromg;
	int p1Num;
	int p2Num;
	int p3Num;
	
	public void umpireMethod() {
	     Guesser gu= new Guesser(); 
		   
	      g1fromg=   gu.guessMethod();
	     Player pl= new Player();
	     p1Num= pl.playerMethod();
	     Player pl1= new Player();
	      p2Num= pl1.playerMethod();
	    		Player pl2= new Player();
	                 p3Num  =  pl2.playerMethod();
	}
	public void  compare() {
	     if(p1Num==g1fromg ) {
	    	 if(p2Num==g1fromg && p3Num==g1fromg  ) {
	    		 System.out.println("All won the game");
	    		
	    	 }
	    	 else if (p3Num==g1fromg) {
	    		 System.out.println("player1 and player2 won the game");
	    	 }
	    	 else if(p2Num==g1fromg) {
	    	
	    		 System.out.println("player1 and player2 won the game" );
	    	 }
	    	 else
	    	 System.out.println("Player 1 won the game");
	   
	     }
	     else if(p2Num==g1fromg) {
	    	  if (p3Num==g1fromg) {
	    		 System.out.println("Player2 and player3 won the game");
	    	  }
	    	  else
	    	 System.out.println("Player 2 won the game");
	     }
	     else if (p3Num==g1fromg) {
	    	 System.out.println("Player 3 won the game");
	     }
	     else
	    	 System.out.println("Lost in the game please try again");
	}
}

public class GuesserGame {

	public static void main(String[] args) {
		Umpire ump= new Umpire();
		ump.umpireMethod();
      ump.compare();
	
	}
}