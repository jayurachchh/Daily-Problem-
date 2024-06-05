import java.util.Scanner;
public class Sixthprogram 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        int distance = findBitDistance(num1, num2);
        System.out.println("Bit distance between " + num1 + " and " + num2 + ": " + distance);
        scanner.close();
    }

    static int findBitDistance(int num1, int num2) {
        int xorResult = num1 ^ num2;
        System.out.println(xorResult);
        int distance = 0;
        while (xorResult != 0) {
            distance += xorResult & 1;
            System.out.println(distance);
            xorResult >>= 1;
        }
        return distance;
    }
}
