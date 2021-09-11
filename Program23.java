1.	class S{  
2.	  void m(){  
3.	  System.out.println("method is invoked");  
4.	  }  
5.	  void n(){  
6.	  this.m();//no need because compiler does it for you.  
7.	  }  
8.	  void p(){  
9.	  n();//complier will add this to invoke n() method as this.n()  
10.	  }  
11.	  public static void main(String args[]){  
12.	  S s1 = new S();  
13.	  s1.p();  
14.	  }  
15.	}  
