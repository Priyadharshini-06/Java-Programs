//dynamic binding
	class Animal{  
	 void eat(){System.out.println("Animal is eating...");}  
	}  
	 public class Dog extends Animal{  
	 void eat(){System.out.println("Dog is eating...");}  
	 public static void main(String args[]){  
	  Animal h=new Dog();  
	  h.eat();  
	 }  
	}