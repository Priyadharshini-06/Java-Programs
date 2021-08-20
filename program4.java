1.class Rectangle{
2.int length;
3.int width;
4.
5.void insert(int l,int w){
6.length=l;
7.width=w;
8.}
9.
10.void calculateArea(){System.out.println(length*width);}
11.
12.public static void main(String args[]){
13.Rectangle r1=new Rectangle();
14.Rectangle r2=new Rectangle();
15.
16.r1.insert(11,5);
17.r2.insert(3,15);
18.
19.r1.calculateArea();
20.r2.calculateArea();
21.}
22.}