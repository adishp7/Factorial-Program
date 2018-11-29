import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        boolean keepgoing = true;
        while(keepgoing == true)
            {
                System.out.println("Welcome to the factorial program \n" +
                "Please enter a number you want to get a factorial for");
                Scanner sc = new Scanner(System.in);
                int number = sc.nextInt();
                System.out.println(Factorial.fact(number));
                System.out.println("Do you want to continue? (True/False) ");
                keepgoing = sc.nextBoolean(); 
            }
        System.out.println("Thanks for trying the program");            
    }
}
