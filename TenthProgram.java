import java.util.*;
class Tenthprogram 
{
    public static Boolean returnindex(int arr[])
    {
        int sum;
        for(int i=0;i<arr.length;i++)
        {
            sum=i+arr[i];
            if(sum==arr.length-1)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of element");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter the Element");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        Boolean value =returnindex(arr);

        System.out.println(value);
    }
}
