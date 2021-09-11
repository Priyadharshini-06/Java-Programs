3.	class Student9{  
4.	     int rollno;  
5.	     String name;  
6.	     static String college = "ITS";  
7.	       
8.	     static void change(){  
9.	     college = "BBDIT";  
10.	     }  
11.	  
12.	     Student9(int r, String n){  
13.	     rollno = r;  
14.	     name = n;  
15.	     }  
16.	  
17.	     void display (){System.out.println(rollno+" "+name+" "+college);}  
18.	  
19.	    public static void main(String args[]){  
20.	    Student9.change();  
21.	  
22.	    Student9 s1 = new Student9 (111,"Karan");  
23.	    Student9 s2 = new Student9 (222,"Aryan");  
24.	    Student9 s3 = new Student9 (333,"Sonoo");  
25.	  
26.	    s1.display();  
27.	    s2.display();  
28.	    s3.display();  
29.	    }  
30.	}  
