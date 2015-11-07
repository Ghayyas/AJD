
public class FailSoftArray {

  private int a[];
  private int errval;
  public int length;
  
  public FailSoftArray(int size, int errv){
	  a  = new int[size];
	  errval = errv;
	  length = size;
  }
  //Return Value At Given index
  
  public int get(int index){
	  if(indexOK(index)) return a [index];
    return errval;
  }

boolean put(int index, int val) {
	// TODO Auto-generated method stub
	if(indexOK(index)){
		a[index] = val;
		return true;
	}
	
	return false;
}

	//Return true if index is within bounds

	private boolean indexOK(int index){
		if(index >= 0 & index <length) return true;
		return false;
	}
}
 class FsDemo{
	 public static void main(String args[]){
		 FailSoftArray fs = new FailSoftArray(5, -1);
		 int x;
		// show quite failures
	 
		 System.out.println("Fails");

	  for(int i=0; i<(fs.length*2); i++)
		  fs.put(i, i*10);
	  
	  for(int i = 0; i<(fs.length*2); i++){
		  x = fs.get(i);
		  
		  if(x != -1 ) System.out.println(x + "");
	  }
	  System.out.println("");
	  
	  // now, handels Failures
	  
	  System.out.println("\n Fail with Error Reports");
	  for(int i=0; i<(fs.length*2); i++)
		  if(!fs.put(i, i*10))
			  System.out.println("Index " + i + "out of bounds");
	  for(int i=0; i<(fs.length*2); i++){
		  x = fs.get(i);
		  if(x!= -1) System.out.println(x + "");
		  else
			  System.out.println("Index " + i + "Out of BOUnds");
	  }
	 }	 
 }
  
