//Java Runtime Polymorphism
	class Bank{  
	int Interest(){return 0;}  
	}  
	  
	class SBI extends Bank{  
	int Interest(){return 10;}  
	}  
	  
	class ICICI extends Bank{  
	int Interest(){return 8;}  
	}  
	class AXIS extends Bank{  
	int Interest(){return 11;}  
	}  
	  
	public class Test{  
	public static void main(String args[]){  
	Bank b1=new SBI();  
	Bank b2=new ICICI();  
	Bank b3=new AXIS();  
	System.out.println("SBI Rate of Interest: "+b1.Interest());  
	System.out.println("ICICI Rate of Interest: "+b2.Interest());  
	System.out.println("AXIS Rate of Interest: "+b3.Interest());  
	}  
	}