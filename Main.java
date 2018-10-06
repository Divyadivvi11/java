import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        int b;
        Scanner s = new Scanner(System.in);
        System.out.println("");
        b= s.nextInt();
        if(b > 0)
        {
            System.out.println(" Positive");
        }
        else if(b < 0)
        {
            System.out.println(" Negative");
        }
        else
        {
            System.out.println("zero ");
        }
    }
}
