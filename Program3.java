 public	class Student2{  
	 int rollno;  
	 String name;  
	  
	 void insertRecord(int r, String n){  //method  
	  rollno=r;  
	  name=n;  
	 }  
	  
	 void displayInformation(){System.out.println(rollno+" "+name);}//method  
	  
	 public static void main(String args[]){  
	  Student2 s1=new Student2();  
	  Student2 s2=new Student2();  
	  
	  s1.insertRecord(108,"Priya");  
	  s2.insertRecord(100,"Akshaya");  
	  s1.displayInformation();  

	  s2.displayInformation();  
	  
	 }  
	}  
