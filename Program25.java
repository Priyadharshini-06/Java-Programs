1.	class B{  
2.	  A4 obj;  
3.	  B(A4 obj){  
4.	    this.obj=obj;  
5.	  }  
6.	  void display(){  
7.	    System.out.println(obj.data);//using data member of A4 class  
8.	  }  
9.	}  
10.	  
11.	class A4{  
12.	  int data=10;  
13.	  A4(){  
14.	   B b=new B(this);  
15.	   b.display();  
16.	  }  
17.	  public static void main(String args[]){  
18.	   A4 a=new A4();  
19.	  }  
20.	}  
