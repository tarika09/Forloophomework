import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int n;
        int count = 0;
        System.out.println("Enter any number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++)
        {
            if (n % 1 == 0)
            {

                count++;
            }

        }
        if (count == 2)
            System.out.println("Prime Number");
        else
            System.out.println("Number is not Prime");


         {
            
        }


    }
}