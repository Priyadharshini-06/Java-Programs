3.	class Student13{  
4.	    int id;  
5.	    String name;  
6.	    Student13(){System.out.println("default constructor is invoked");}  
7.	      
8.	    Student13(int id,String name){  
9.	    this ();//it is used to invoked current class constructor.  
10.	    this.id = id;  
11.	    this.name = name;  
12.	    }  
13.	    void display(){System.out.println(id+" "+name);}  
14.	      
15.	    public static void main(String args[]){  
16.	    Student13 e1 = new Student13(111,"karan");  
17.	    Student13 e2 = new Student13(222,"Aryan");  
18.	    e1.display();  
19.	    e2.display();  
20.	   }  
21.	}  
