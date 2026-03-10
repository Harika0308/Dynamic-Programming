import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) 
    {
        int n, i;
        long factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        for(i = 1; i <= n; i++)
        {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + n + " is " + factorial);
    }
}
