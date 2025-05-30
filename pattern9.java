//File name has to be same as the name of your class

// class FirstClass {
// public static void main(String[] args) {
// System.out.println("Hello World with java");
// System.out.print("welcome to java world\nfrom apna college and\nZoya Shaikh\n");
// System.out.print("Hello World");
// }
// }

// // print stars
// public class FirstClass {
// public static void main(String[] args) {
// System.out.println("*");
// System.out.println("**");
// System.out.println("***");
// System.out.println("****");
// System.out.println("*****");
// }
// }

// variables and datatypes in java
// java is a typed language
// public class FirstClass {
// public static void main(String[] args) {
// string name = "Zoya Shaikh";
// int age = 17;
// int a = 5;
// int b = 10;
// double price = 25.25;
// //all the variables's values change be change in future if needed
// //for eg:
// a = 10;
// name = "Tony Stark";
// }

// }

// operations of variables
// public class FirstClass {
// public static void main(String[] args) {
// int a = 10;
// int b = 25;
// int sum = a + b;
// System.out.println(sum);
// int diff = b - a;
// System.out.println(diff);
// int mul = a * b;
// System.out.println(mul);
// }

// }

// import java.util.*;

// public class main {

// public static void main(String[] args) {
// //input
// Scanner sc = new Scanner(System.in);
// String name = sc.nextLine(); //use only next if single word is to be taken a
// input
// //nextInt
// //nextFloat
// //nextDouble
// //nextLong and many more
// System.out.println(name);
// }
// }

// //practice Qs 1
// //take 2 variables 'a' & 'b' as input and print their sums
// import java.util.*;
// public class main{
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
// int sum = a + b;
// System.out.println(sum);
// }
// }

// //conditional statements
// import java.util.Scanner;

// public class conditions {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int age = sc.nextInt();

// if (age > 18) {
// System.out.println("Adult");
// } else{
// System.out.println("Not Adult");
// }
// }

// }

// //Identify Even / Odd
// import java.util.Scanner;

// public class conditions {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int x = sc.nextInt();
// if (x % 2 == 0) {
// System.out.println("Even");
// } else {
// System.out.println("Odd");
// }
// }
// }

// if else statements
// import java.util.Scanner;

// public class conditions {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();

// if (a == b) {
// System.out.println("Equal");
// } else {
// if (a > b) {
// System.out.println("A is Greater.");
// } else {
// System.out.println("A is Lesser.");
// }
// }

// }
// }

// //if elseif statement
// import java.util.Scanner;

// public class conditions {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();

// if (a > b) {
// System.out.println("A is Greater.");
// } else if (a < b) {
// System.out.println("A is Lesser.");
// } else{
// System.out.println("Equal");
// }
// }
// }

// Qs 2
// import java.util.Scanner;

// public class conditions {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int button = sc.nextInt();

// if (button == 1) {
// System.out.println("Hello");
// } else if (button == 2) {
// System.out.println("Salam");
// } else if (button == 3) {
// System.out.println("Bonjour");
// } else{
// System.out.println("Invalid Button!");
// }
// }
// }

// //Switch Case
// import java.util.Scanner;

// public class conditions {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int button = sc.nextInt();

// switch (button) {
// case 1:
// System.out.println("Hello");
// break;
// case 2:
// System.out.println("Salam");
// break;
// case 3:
// System.out.println("Bonjour");
// break;

// default:
// System.out.println("Invalid Button!");
// break;
// }
// }
// }

// make a calculator using Switch

// //Loops
// public class theloop {
// public static void main(String[] args) {
// for (int counter = 0; counter < 11; counter++) {
// System.out.println("Hello World!");
// System.out.println(counter);
// }
// }

// }

// //Q3 using while loop print numbers from 0 to 10
// public class theloop {

// public static void main(String[] args) {
// int i = 0;
// while (i<11) {
// System.out.println(i);
// i++;
// }

// }
// }

// //Q3 using do-while loop print numbers from 0 to 10
// public class theloop {

// public static void main(String[] args) {
// int i = 0;
// do {
// System.out.println(i);
// i++;
// } while (i <= 10);
// }
// }

// //Q4 print the sum of first n natural numbers

// import java.util.Scanner;

// public class theloop {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// int sum = 0;
// for (int i = 0; i <= n; i++) {
// sum = sum + i;
// }
// System.out.println(sum);
// }
// }

// //print table of input by the user
// import java.util.Scanner;

// public class theloop {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// int sum = 0;
// for (int i = 1; i <= 10; i++) {

// System.out.println(i*n);
// }
// }
// }

// Patterns

// //Qs. 1
// //Using Nested Loops print solid rectangle
// public class patterns {
//     public static void main(String[] args) {

//         for (int i = 1; i <= 4; i++) {
//             for (int j = 1; j <= 5; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

// }

// //Qs. 2
// //print hollow rectangle
// public class patterns2 {
// public static void main(String[] args) {
//     int n = 4;
//     int m = 5;

//     for (int i = 1; i <= n; i++) {
//         for (int j = 1; j <= m; j++) {
//             if (i == 1 || j == 1 || i == n || j == n) {
//                 System.out.print("*");
//             } else {
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
//     }
// }

// }

// //Qs. 3
// //Print Half Pyramid
// public class patterns3 {
// public static void main(String[] args) {
//     int n = 4;
//     for (int i = 1; i <= n; i++) {
//         for (int j = 1; j <= i; j++) {
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }
// }

// //Qs. 4
// //Print Inverted Half Pyramid
// public class patterns4 {
// public static void main(String[] args) {
//     int n = 4;

//     for (int i = n; i >= 1; i--) {
//         for (int j = 1; j <= i; j++) {
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }   
// }

// // Qs. 5
// // Print inverted half pyramid (rotated by 180deg)
// public class pattern5{
//     public static void main(String[] args) {
//         int n = 4;

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//         System.out.println();
//         }
//     }
// }

// //Qs. 6
// //Print numbers in pyramid form
// public class pattern6 {
// public static void main(String[] args) {
//     int n = 5;

//     for (int i = 1; i <= n; i++) {
//         for (int j = 1; j <= i; j++) {
//             System.out.print(j);
//         }
//         System.out.println();
//     }
// }
// }

// // Qs. 7
// //Inverted Half Pyramid With Numbers
// public class pattern7 {
// public static void main(String[] args) {
//     int n = 5;

//     for(int i = 1; i <= n; i++){
// for (int j = 1; j <= n - i + 1; j++) {
//     System.out.print(j);
// }
// System.out.println();
//     }
// }

// }

// //Qs. 8
// //Print the Floyd's Triangle Pattern
// public class pattern8 {
//     public static void main(String[] args) {
//         int n = 5;
//         int number = 1;

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(number);
//                 System.out.print(" ");
//                 number++;
//             }
//             System.out.println();
//         }
//     }

// }

// //Qs. 9  --> Most IMP
// //Print 0-1 Triangle
// public class pattern9 {
//     public static void main(String[] args) {
//         int n = 5;

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 int sum = i + j;
//                 if (sum % 2 == 0) { // even
//                     System.out.print("1 ");
//                 } else { // odd
//                     System.out.print("0 ");
//                 }
//             }
//             System.out.println();
//         }
//     }

// }

//Qs. 10
//Butterfly Pattern

//RECURSION -->
//calculate n Factorial of 1st five numbers  -->using recursion

//Strings in Java 
// Qs 1
// class pattern9{
//     public static void main(String[] args) {
//         int num;
//         double result;
//     }
// }

// //CONSTRUCTOR
// class Demo{
//     int x , y;
//     void fun1(){

//     }
//     void fun2(){

//     }

//     Demo(int p,int q){
//         x = p;
//         y = q;
//     }
// }

// class construct{
//     public static void main(String[] args) {
//         Demo d1 = new Demo(5,6);
//         Demo d2 = new Demo(2,3);
//         Demo d3 = new Demo(7,8);
//         System.out.println(d1.x);
//         System.out.println(d1.y);
//         System.out.println("constructor\n" + d2.y + "\n" + d3.x);
//     }
// }

