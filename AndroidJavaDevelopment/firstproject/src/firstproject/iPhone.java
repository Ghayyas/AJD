package firstproject;

public class iPhone extends Phone{
  boolean hasAppleLogo = true;
  String color = "black";
  void adjustPrice(){
	  
	  if(hasAppleLogo){
		  
		  price+=4500;
	  }
  }
}
