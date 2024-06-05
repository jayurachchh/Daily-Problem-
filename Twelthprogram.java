import java.util.*;

public class Twelthprogram 
{
    public static Boolean Stringcheck(String str,String wordict[])
    {
        for (int i = 0; i < wordict.length; i++) {
            if(str.contains(wordict[i]))
            {
                str=str.replace(wordict[i], "");
            }
            
        }
        if (str=="") 
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the String");
        String str=sc.nextLine();

        System.out.println("Enter the string length");
        int n=sc.nextInt();
        sc.nextLine();
        String [] worddict=new String[n];

        System.out.println("Enter the String");
        for (int i = 0; i <worddict.length; i++) 
        {
            worddict[i]=sc.nextLine();    
        }

        System.out.println(Stringcheck(str,worddict) );

        // System.out.println(Arrays.toString(worddict));
    }
}
