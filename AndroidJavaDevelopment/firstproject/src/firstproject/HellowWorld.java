package firstproject;

public class HellowWorld {
	static double pi = 3.14;
	public static void main(String[] args){
		//System.out.println("hellow World");
	 double hello = 2.0;
	 hello = pi+hello;
	 secondaryMethod(hello);
		System.out.println(hello);
	}
	
	static void secondaryMethod(double hello){
		hello = hello + 5;
	}

}
