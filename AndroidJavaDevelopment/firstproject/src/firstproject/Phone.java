package firstproject;

public class Phone {
	//Phone class variables
    int weight = 10;
    int numProcessingCores = 4;
    int price = 200;
    boolean turnedOn = false;
    
    public void togglePower() {
        // turnedOn is now its opposite (true becomes false, and vice versa)
        turnedOn = !turnedOn;
    }

}
