1.	class Student6{  
2.	    int id;  
3.	    String name;  
4.	    Student6(int i,String n){  
5.	    id = i;  
6.	    name = n;  
7.	    }  
8.	      
9.	    Student6(Student6 s){  
10.	    id = s.id;  
11.	    name =s.name;  
12.	    }  
13.	    void display(){System.out.println(id+" "+name);}  
14.	   
15.	    public static void main(String args[]){  
16.	    Student6 s1 = new Student6(111,"Karan");  
17.	    Student6 s2 = new Student6(s1);  
18.	    s1.display();  
19.	    s2.display();  
20.	   }  
21.	}  
