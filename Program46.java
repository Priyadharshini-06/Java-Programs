//Java interface
	interface able{  
	void print();  
	}  
	public class And implements able{  
 	public void print(){System.out.println("How are you?");}  
	public static void main(String args[]){  
	And hp = new And();  
	hp.print(); 
	}  
	}