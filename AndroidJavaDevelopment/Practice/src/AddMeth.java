class Vehicle{
	int passangers;
	int fuelcap;
	int mpg;
	void range(){
		System.out.println("\n Range is "+fuelcap * mpg);
	}
}
public class AddMeth {
 
	public static void main(String[] args){
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		
		minivan.passangers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		//assign values to fields
		
		sportscar.passangers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		System.out.print("Minivan can carry " +minivan.passangers + ".");
		
		
		 
		 minivan.range(); // displays the range
		
		System.out.println("Sports car can carry " + sportscar.passangers + "." );
	
		sportscar.range();
	}
}
