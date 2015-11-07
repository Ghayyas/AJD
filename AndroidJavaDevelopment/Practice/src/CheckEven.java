class CheckNum{
	//return true
	boolean isEven(int x){
		if((x%2)==0) return true;
		else return false;
	}
}
public class CheckEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckNum e = new CheckNum();
		
		if(e.isEven(10))System.out.print(false);
		
		if(e.isEven(9)) System.out.print(false);
		if(e.isEven(8)) System.out.print("\n true");

	}

}
