import java.util.Scanner;

public class Ninethprogram 
{
    public static int Binarysearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[end]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return arr[start];
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Size of array");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter the Element");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i]=sc.nextInt();    
        }
        
        int value=Binarysearch(arr);

        System.out.println(value);
    }
}
