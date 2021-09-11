1.	class Counter{  
2.	int count=0;//will get memory when instance is created  
3.	  
4.	Counter(){  
5.	count++;  
6.	System.out.println(count);  
7.	}  
8.	  
9.	public static void main(String args[]){  
10.	  
11.	Counter c1=new Counter();  
12.	Counter c2=new Counter();  
13.	Counter c3=new Counter();  
14.	  
15.	 }  
16.	}  
