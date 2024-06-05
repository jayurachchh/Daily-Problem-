import java.util.*;
public class Thirdprogram 
{
    public static int TrallingZero(int n)
    {
        int sum=0;
        while(n>0)
        {
            n=n/5;
            sum=sum+n;
        }
        return sum; 
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number");
        int n=sc.nextInt();

        System.err.println(TrallingZero(n));
    }
}
