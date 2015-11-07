package firstproject;

import java.util.Random;

public class CoinTossSwitch {

	public static void main(String[] args){
		Random rand = new Random();
		int RandomInt = rand.nextInt(2);
		System.out.println(RandomInt);
	  switch(RandomInt){
	  case 0:
	   System.out.println("Tails");
	  break;
	  case 1:
		  System.out.println("Heads!");
		  break;
	  }
	}
}
