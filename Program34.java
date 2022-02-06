//super is used to invoke parent class constructor.
	class Vehicle{  
	  Vehicle(){System.out.println("Vehicle is Created!! ");}  
	}  
	  
	public class Bike5 extends Vehicle{  
	  Bike5(){  
	   super();//will invoke parent class constructor  
	   System.out.println("Bike is Created and it is Running");  
	  }  
	  public static void main(String args[]){  
	   Bike5 b=new Bike5();  
	        
	}  
	}	}