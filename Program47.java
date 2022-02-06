//Multiple inheritance is not supported through class in java but it is possible by interface, why?
	interface able{  
	void print();  
	}  
	interface Show{  
	void print();  
	}  
	public class Test implements able,Show{  
	public void print(){System.out.println("Hello!How Are You?");}  
	public static void main(String args[]){  
	Test o = new Test();  
	o.print();  
	 }  
	}