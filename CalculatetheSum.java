import java.util.Scanner;

public class CalculatetheSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = scanner.nextInt();
        //declare a variable to store the current number in the series
         double sum = 0.0;
        for (int i = 1; i <=n ; i++)
         //add the current number in the series to the sum
        {
            sum = sum + 1.0 / i;

        }
        //print the sum
        System.out.println(sum );
    }

}
