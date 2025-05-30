//FIRST PROGRAM IN JAVA.
// public class Coding {
//     public static void main(String[] args) {
//         System.out.println("Hello World with Java!");
//     }
// }


// ACCESS SAME CLASS'S MEMBERS USING STATIC KEYWORD.
// public class Example{
//     static void fun1(){
//         System.out.println("A");
//     }
//     static void fun2(){
//         System.out.println("B");
//     }
//     public static void main(String[] args) {
//         fun1();
//         fun2();
//     }
// }


//ACCESS THE FUNCTION OF ANOTHER CLASS.
// class Area{
//     static void fun1(){    //static member function
//         System.out.println("Area 1.");
//     }
//     static void fun2(){
//         System.out.println("Area 2.");
//     }
// }

// class Example{
//     static void fun1(){
//         System.out.println("A");
//     }
//     static void fun2(){
//         System.out.println("B");
//     }

//     public static void main(String[] args) {
//         System.out.println("C");
//         Area.fun1();
//         Area.fun2();
//     }
// }


//ACCESS THE MEMBERS OF A CLASS 'WITHOUT USING STATIC KEYWORD'.
// class Mahesh{
//     void fun1(){
//         System.out.println("fun 1 executed");
//     }
//     void fun2(){
//         System.out.println("fun 2 executed");
//     }
// }
// public class Object1{
//     public static void main(String[] args) {
//         Mahesh m1 = new Mahesh();
//         m1.fun1();
//         m1.fun2();
//     }
// }


//ACCESS PRIVATE MEMBER FUNCTION.
// class Demo{
//     private static int x;
//     void fun1(){
//         x = 5;  //NOTE:class members can access this variable
//     }
// }
// public class Program1{
//     public static void main(String[] args) {
//         Demo d1 = new Demo();
//         d1.fun1();
//     }
// }


//ACCESS PRIVATE STATIC MEMBER VARIABLE 'WITHOUT CREATING AN OBJECT'.
// class Demo{
//     private static int x;
//     static void f1(){
//         x = 5;
//         System.out.println("5 is assigned to X.");
//     }
// }
// class Program1{
//     public static void main(String[] args) {
//         Demo.f1();
//     }
// }


// class A{
//     int x;
//     private static int y;
//     void fun1(){
//        y = 22;
//     }
//     void fun2(){
//         System.out.println(y);
//     }
//     void fun3(){
//         y = 45;
//     }
// }
// public class StaticMembers {
// public static void main(String[] args) {
//     A a1 = new A();
//     A a2 = new A();
//     a1.fun1();
//     a2.fun3();
//     a1.fun2();
// }
// }



//ADD DATA INTO A PRIVATE INSTANCE MEMBER VARIABLE 
// class A{
//     private int x;
//     private static int y;
//     void fun1(){
//         y = 22;
//         x = 5;
//     }
//     void fun2(){
//         System.out.println(x);
//     }
//     void fun3(){
//         y = 45;
//     }
// }
// public class StaticMembers{
// public static void main(String[] args) {
//     A a1 = new A();
//     A a2 = new A();
//     a1.fun1();
//     a2.fun2();
// }
// }


// class Nokia{
//     private int mic;
//     private int cam;
//     void setValue(){
//         mic = 2;
//         cam = 40;
//     }
//     void display(){
//         System.out.println(mic);
//         System.out.println(cam);
//     }
// }
// public class ClassesandObject{
//     public static void main(String[] args) {
//         Nokia n1 = new Nokia();
//         n1.display();
//         n1.setValue();
//         n1.display();
//     }
// }


// public class Example{
//     static void fun1(){
//         System.out.println("A");
//     }
//     static void fun2(){
//         System.out.println("B");
//     }
//     public static void main(String[] args) {
//         System.out.println("C");
//         fun1();
//         fun1();
//         fun1();
//     }
// }



//WRAPPER CLASS IN JAVA