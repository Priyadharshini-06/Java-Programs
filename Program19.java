1.	class Student10{  
2.	    int id;  
3.	    String name;  
4.	      
5.	    Student10(int id,String name){  
6.	    id = id;  
7.	    name = name;  
8.	    }  
9.	    void display(){System.out.println(id+" "+name);}  
10.	  
11.	    public static void main(String args[]){  
12.	    Student10 s1 = new Student10(111,"Karan");  
13.	    Student10 s2 = new Student10(321,"Aryan");  
14.	    s1.display();  
15.	    s2.display();  
16.	    }  
17.	}  
