//Understanding the problem without method overriding
	class Vehicle{  
	  void run(){System.out.println("The VEHICLE is RUNNING");}  
	}  
	public class Bike extends Vehicle{  
	    
	  public static void main(String args[]){  
	  Bike obj = new Bike();  
	  obj.run();  
	  }  
	}