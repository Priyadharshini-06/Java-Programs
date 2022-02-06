//Abstract class having constructor, data member, methods etc.
	abstract class Bike{  
	   Bike(){System.out.println("Bike is created");}  
	   abstract void run();  
	   void changeGear(){System.out.println("Gear changed");}  
	 }  
	 class Royal extends Bike{  
	 void run(){System.out.println("Running safely");}  
	 }  
	 public class Abstraction2{  
	 public static void main(String args[]){  
	  Bike obj = new Royal();  
	  obj.run();  
	  obj.changeGear();  
	 }  
	}