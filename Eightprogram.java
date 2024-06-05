public class Eightprogram {
        public static void main(String[] args) {
            String s = "    -042";
            int ans = myAtoi(s);
            System.out.println(ans);
        }
    
        static int myAtoi(String s) {
            s = s.trim();
            System.out.println("Trimmed String : " + s);
            if (s.isEmpty()) {
                return 0;
            }
            int ans = 0, i = 0;
            boolean neg = s.charAt(0) == '-';
            System.out.println("Negative : " + neg);
            boolean pos = s.charAt(0) == '+';
            System.out.println("Positive : " + pos);
    
            if (neg || pos) {
                i++;
                System.out.println("i : " + i);
            }
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                System.out.println("String Length : " + s.length());
                System.out.println("Character.isDigit(s.charAt(i)) : " + Character.isDigit(s.charAt(i)));
                int digit = s.charAt(i) - '0';
                System.out.println("Digit : " + digit);
    
                if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                    System.out.println("Ans : " + ans);
                    return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                ans = ans * 10 + digit;
                System.out.println("Answer : " + ans);
                i++;
                System.out.println("i : " + i);
            }
            return neg ? -ans : ans;
        }
    }
 