//Example of method overriding
	class Vehicle{  
	void run(){System.out.println("Running");}  
	}  
	public class Bike2 extends Vehicle{  
	void run(){System.out.println("Bike is running safely and with proper speed limits");}  
	  
	public static void main(String args[]){  
	Bike2 obj = new Bike2();  
	obj.run();  
	}  
}