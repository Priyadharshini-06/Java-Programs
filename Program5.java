1.class Calculation{
2.
3.void fact(int n){
4.int fact=1;
5.for(int i=1;i<=n;i++){
6.fact=fact*i;
7.}
8.System.out.println("factorial is"+fact);
9.}
10.
11.public static void main(String args[]){
12.new Calculation().fact(5);//calling method with annonymous object
13.}
14.}
