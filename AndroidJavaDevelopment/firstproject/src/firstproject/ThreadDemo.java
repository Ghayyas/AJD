package firstproject;

public class ThreadDemo {
	public static void main(String[] args){
		
		 Thread thread = new Thread(){
			 public void run(){
				 for (int i =0; i<10; i+=2){
					 System.out.println("Hellow this is firt thread");;
				 }
				 
			 }
		 };
		 Thread threadTwo = new Thread(){
			 
			 public void run(){
				 
				 for(int i = 0; i <10; i+=2){
					 
					 System.out.println("hellow from thread two");
				 }
			 }
		 };
		 
		 thread.start();
		 threadTwo.start();
	}

}
