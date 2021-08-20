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
13.Rectangle r1=new Rectangle(),r2=new Rectangle();//creating two objects
14.
15.r1.insert(11,5);
16.r2.insert(3,15);
17.
18.r1.calculateArea();
19.r2.calculateArea();
20.}
}