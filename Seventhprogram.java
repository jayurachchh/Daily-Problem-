import java.util.*;
public class Seventhprogram 
{
        public static void Linkedlist(int n,int n1)
        {
            Scanner sc=new Scanner(System.in);
            LinkedList<Integer> l1=new LinkedList<>();
            LinkedList<Integer> l2=new LinkedList<>();
            LinkedList<Integer>
             l3=new LinkedList<>();
            System.out.println("Enter the Element of 1st linked list");
            for(int i=0;i<n;i++)
            {
                int data=sc.nextInt();
                l1.add(data);
            }
            System.out.println(l1);
            System.out.println("Enter the Element of 2nd linked list");
            for(int i=0;i<n1;i++)
            {
                int data=sc.nextInt();
                l2.add(data);
            }
            System.out.println(l2);
       // Adding elements of l1 and l2 and storing the sums in l3
       int maxSize = Math.max(l1.size(), l2.size());
       int carry = 0;
       
       for (int i = 0; i < maxSize; i++) {
        int sum = carry;
           if (i < l1.size()) {
               sum += l1.get(i);
           }
           if (i < l2.size()) {
               sum += l2.get(i);
           }
           if (sum >= 10) {
            carry = sum / 10; // Calculate the carry for the next digit
            sum = sum % 10; // Store the last digit of the sum in the current position
        } else {
            carry = 0; // No carry if sum is less than 10
        }
                    
        l3.add(sum); // Add the result to l3
    }

    // If there is any carry left after the last addition, add it to l3
    if (carry > 0) {
        l3.add(carry);
    }

    System.out.println("Resulting LinkedList after addition: " + l3.reversed());

    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Number of Element of 1st linked list");
        int n=sc.nextInt();

        System.out.println("Enter the Number of Element of 2nd linked list");
        int n1=sc.nextInt();

        Linkedlist(n,n1);
    }
}
