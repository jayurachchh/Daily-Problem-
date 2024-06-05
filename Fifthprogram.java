import java.util.Scanner;
public class Fifthprogram 
{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter binary number with fractional part : ");
            String binary = scanner.nextLine();
            double decimal = binaryToDecimal(binary);
            System.out.println("Decimal value: " + decimal);
            scanner.close();
        }
    
        static double binaryToDecimal(String binary) {
            String[] parts = binary.split("\\.");
            String integerPart = parts[0];
            String fractionalPart = parts.length > 1 ? parts[1] : "";
    
            double decimalValue = 0;
    
            int intValue = 0;
            for (int i = 0; i < integerPart.length(); i++) {
                char bit = integerPart.charAt(i);
                if (bit == '1') {
                    intValue += Math.pow(2, i);
                }
            }
    
            double fracValue = 0;
            for (int i = 0; i < fractionalPart.length(); i++) {
                char bit = fractionalPart.charAt(i);
                if (bit == '1') {
                    fracValue += 1.0 / Math.pow(2, i + 1);
                }
            }
    
            decimalValue = intValue + fracValue;
            return decimalValue;
        }
    }
    

