public class square{  
	 int side;
	  
	 void insert(int s){  
	  
	  side=s;  
	 }  
	  
	 void calculateArea(){System.out.println(side*side);}  
	  
	 public static void main(String args[]){  
	  square s1=new square();  
	  
	  
	  s1.insert(11);  
	 
	  
	  s1.calculateArea();  
	  
	}  
 }  

