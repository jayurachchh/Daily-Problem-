import java.util.*;
public class Eleventhprogram 
{
    public static int Divisior(double div,double divisr)
    {
        double value=div/divisr;
        return ((int)value);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Dividend");
        double div=sc.nextInt();

        System.out.println("Enter the Divisior");
        double divisr=sc.nextInt();

        int value=Divisior(div,divisr);

        System.out.println(value);

    }
}
