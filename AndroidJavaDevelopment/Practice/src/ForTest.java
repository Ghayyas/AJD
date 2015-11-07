
public class ForTest {

	public static void main(String[] args)
	
	throws java.io.IOException{
		int i;
		System.out.println("Press S to Stop");
		for(i = 0; (char) System.in.read() != 's'; i++){
			System.out.println("Pass #" +i);
		}
	}
}
