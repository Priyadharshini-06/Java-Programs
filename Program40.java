//Java Runtime Polymorphism with Multilevel Inheritance
class Animal{  
	void eat()
	{System.out.println("Eating");}  
	}  
	class Dog extends Animal{  
	void eat(){System.out.println("Eating fruits");}  
	}  
	public class BabyDog extends Dog{  
	void eat(){System.out.println("Drinking milk");}  
	public static void main(String args[]){  
	Animal h1,h2,h3;  
	h1=new Animal();  
	h2=new Dog();  
	h3=new BabyDog();  
	h1.eat();  
	h2.eat();  
	h3.eat();  
	}  
	}