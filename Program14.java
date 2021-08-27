1.class Student5{
2.int id;
3.String name;
4.int age;
5.Student5(int i,String n){
6.id=i;
7.name=n;
8.}
9.Student5(int i,String n,int a){
10.id=i;
11.name = n;
12.age=a;
13.}
14.void display(){System.out.println(id+" "+name+" "+age);}
15.
16.public static void main(String args[]){
17.Student5 s1=new Student5(111,"Karan");
18.Student5 s2=new Student5(222,"Aryan",25);
19.s1.display();
20.s2.display();
21.}
22.}