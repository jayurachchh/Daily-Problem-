import java.util.*;
public class Firstprogram  
{
    public static int Returnindex(String haystack,String niddle)
    {
        int index=haystack.indexOf(niddle);
        return index;
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter 1st String");
        String haystack=sc.nextLine();

        System.out.println("Enter 2nd String");
        String niddle =sc.nextLine();

        System.out.println(Returnindex(haystack, niddle));
    }    
}
