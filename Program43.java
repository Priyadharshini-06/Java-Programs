//Another example of java instanceof operator
	class Animal{}  
	public class Doggie extends Animal{//Dog inherits Animal  
	public static void main(String args[]){  
	 Doggie d=new Doggie();  
	 System.out.println(d instanceof Animal);//true  
	 }  
	}