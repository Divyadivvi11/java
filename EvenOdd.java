import java.util.Scanner;

class EvenOdd
{
  public static void main(String args[])
  {
    int a;
    System.out.println("");

    
    Scanner input = new Scanner(System.in);
  a = input.nextInt();

    
    if ( a % 2 == 0 )
        System.out.println("valid");
     else
        System.out.println("invalid");
  }
}