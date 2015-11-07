package firstproject;

import java.util.Random;

public class Randomization {

		public static void main(String[] args){
			
			Random rand = new Random();	
			int result = rand.nextInt(11);
		  System.out.println(result);
			if(result == 10){
				System.out.println("Congrates !");
			}
			else{
				System.out.println("not FOund !");
			}
		}
		
}
