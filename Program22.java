1.	class Student14{  
2.	    int id;  
3.	    String name;  
4.	    String city;  
5.	      
6.	    Student14(int id,String name){  
7.	    this.id = id;  
8.	    this.name = name;  
9.	    }  
10.	    Student14(int id,String name,String city){  
11.	    this(id,name);//now no need to initialize id and name  
12.	    this.city=city;  
13.	    }  
14.	    void display(){System.out.println(id+" "+name+" "+city);}  
15.	      
16.	    public static void main(String args[]){  
17.	    Student14 e1 = new Student14(111,"karan");  
18.	    Student14 e2 = new Student14(222,"Aryan","delhi");  
19.	    e1.display();  
20.	    e2.display();  
21.	   }  
22.	}  
