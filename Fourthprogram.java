import java.util.Scanner;

public class Fourthprogram 
{
    public static void Returnindex(int n,int v)
    {
        String mystring="";
        for(int i=1;i<=n;i++)
        {
            mystring+=String.valueOf(i);
        }
        if(v>mystring.length())
        {
            System.out.println("plz enter the valid nth didgit");
        }
        System.out.println(mystring);
        System.out.println(mystring.length());
        System.out.println(mystring.charAt(v-1));
    }
    public static void main(String[] args) 
    {
       
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of string");
        int n=sc.nextInt();

        System.out.println("Enter the which number you want to get");
        int v=sc.nextInt();

        Returnindex(n,v);


    } 
}
