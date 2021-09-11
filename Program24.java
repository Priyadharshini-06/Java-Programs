1.	class S2{  
2.	  void m(S2 obj){  
3.	  System.out.println("method is invoked");  
4.	  }  
5.	  void p(){  
6.	  m(this);  
7.	  }  
8.	    
9.	  public static void main(String args[]){  
10.	  S2 s1 = new S2();  
11.	  s1.p();  
12.	  }  
13.	}  
