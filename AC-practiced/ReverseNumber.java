// print reverse of the given number


public class ReverseNumber {
    public static void main(String[] args) {
        int n = 234567;
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit + "");
            n /= 10;  // n = n / 10
        }
        System.out.println();
    }
}
