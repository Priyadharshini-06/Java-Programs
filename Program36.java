//Java final method
	class Bike{  
	  final void run(){System.out.println("running");}  
	}  
	     
	public class Royal  extends Bike{  
	   void run(){System.out.println("running safely with 100kmph");}  
	     
	   public static void main(String args[]){  
	  Royal h= new Royal();  
	   h.run();  
	   }  
	}