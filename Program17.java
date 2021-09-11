1.	class Counter2{  
2.	static int count=0;//will get memory only once and retain its value  
3.	  
4.	Counter2(){  
5.	count++;  
6.	System.out.println(count);  
7.	}  
8.	  
9.	public static void main(String args[]){  
10.	  
11.	Counter2 c1=new Counter2();  
12.	Counter2 c2=new Counter2();  
13.	Counter2 c3=new Counter2();  
14.	  
15.	 }  
16.	} 
