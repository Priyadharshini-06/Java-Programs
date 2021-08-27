1.class Calculation2
{
2.void sum(int a,int b){System.out.println(a+b);}
3.void sum(double a,double b){System.out.println(a+b);}
4.
5.public static void main(String args[]){
6.Calculation2 obj=new Calculation2();
7.obj.sum(10.5,10.5);
8.obj.sum(20,20);
9.}
10.}