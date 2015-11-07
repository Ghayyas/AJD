
public class Guess {

	public static void main(String[] args) 
		// TODO Auto-generated method stub

	throws java.io.IOException{
		char ch, answer = 'K';
		System.out.println("Print any Key and Guess if its true");
		System.out.println("Guess a Key");
		ch = (char) System.in.read();
		
		if(ch == answer){
			System.out.println("Correct");
		}
		else{
			System.out.println("Wrong !");
		
		}
	}

}
