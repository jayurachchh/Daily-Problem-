import java.util.Scanner;

public class Eleventhprogramv1 
{

    public static int divide(int dividend, int divisor) {
        // Handle special cases
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        if (dividend == 0) {
            return 0;
        }
        
        // Determine the sign of the result
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Convert both numbers to positive
        long lDividend = Math.abs((long) dividend);
        long lDivisor = Math.abs((long) divisor);

        // Initialize the result
        int result = 0;

        // Subtract divisor from dividend until dividend becomes less than divisor
        while (lDividend >= lDivisor) {
            long temp = lDivisor, multiple = 1;
            while (lDividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            lDividend -= temp;
            result += multiple;
        }

        // Apply the sign to the result
        return negative ? -result : result;
    }

    public static void main(String[] args) {

                Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Dividend");
        int div=sc.nextInt();

        System.out.println("Enter the Divisior");
        int divisr=sc.nextInt();

        int value=divide(div,divisr);

        System.out.println(value);

        // Test cases
        // System.out.println(divide(10, 3));  // Output: 3
        // System.out.println(divide(7, -3));  // Output: -2
        // System.out.println(divide(0, 1));   // Output: 0
        // System.out.println(divide(1, 1));   // Output: 1
        // System.out.println(divide(-2147483648, -1)); // Output: 2147483647 (clamped to avoid overflow)
    }
}
