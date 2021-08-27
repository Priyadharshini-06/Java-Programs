1.class Student4{
2.int id;
3.String name;
4.student4(int i,String n){
5.id=i;
6.name=n;
7.}
8.void display(){System.out.println(id+" "+name);}
9.public static void main(String args[]){
10.Student4 s1=new Student4(111,"Karan");
11.Student4 s2=new Student4(222,"Aryan");
12.s1.display();
13.s2.display();
14.}
15.}