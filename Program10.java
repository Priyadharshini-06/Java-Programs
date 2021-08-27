1.class OverloadingCalculation1{
2.void sum(int a,long b){System.out.println(a+b);}
3.void sum(int a,int b,int c){System.out.println(a+b+c);}
4.public static void main(String args[]){
5.OverloadingCalculation1 obj=new OverloadingCalculation1();
6.obj.sum(20,20);//now second int literal will be promoted to long
7.obj.sum(20,20,20);
8.}
9.}