//Why multiple inheritance is not supported in java?
	class A{  
	void msg(){System.out.println("Hii");}  
	}  
	class B{  
	void msg(){System.out.println("Helloo");}  
	}  
	public class C extends A,B{//suppose if it were  
	   
	 Public Static void main(String args[]){  
	   C obj=new C();  
	   obj.msg();//Now which msg() method would be invoked?  
	}  
	}