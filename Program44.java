//Example of abstract class that has abstract method
	abstract class Bike{  
	  abstract void run();  
	}  
	public class Honda extends Bike{  
	void run(){System.out.println("Running safely");}  
	 public static void main(String args[]){  
	 Bike obj = new Honda();  
	 obj.run();  
	}  
	}