package functions;
// import java.util.*;

public class Basics {
    // public static void printHelloWorld(){
    //     System.out.println("Hello World!");
    // }

    // public static int calculateSum(int num1, int num2){   // parameters or formal parameters
    //     int sum = num1 + num2;   // this sum variable has block scope -> it's life is just inside these parenthes
    //     return sum;
    // }



    // public static void main(String[] args) {
    //     printHelloWorld();    // function call

    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int sum = calculateSum(a,b); // arguments or actual parameters   
    //     System.out.println("Sum is :" + sum);   // this sum variable is different from the above [function's] sum.

    //     sc.close();
    // }


    // public static void swap(int a, int b){
    //     int temp = a;  // 10;
    //     a = b;  //5
    //     b = temp; // 10
    //     System.out.println("a is : " + a);
    //     System.out.println("b is : " + b);
    // }

    // public static void main(String[] args) {
    //     // swapping numbers
    //     int a = 10;
    //     int b = 5;
    //     swap(a, b);
        
    // }


    public static int multiply(int a, int b){
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int prod = multiply(a,b);
        System.out.println("a * b : " + prod);
    }

}
