1.class Calculation{
2.void sum(int a,int b){System.out.println(a+b);}
3.void sum(int a,int b,int c){System.out.println(a+b+c);}
4.
5.public static void main(String args[]){
6.Calculation obj=new Calculation();
7.obj.sum(10,10,10);
8.obj.sum(20,20);
9.
10.}
11.}