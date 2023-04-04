import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit = scanner.nextInt();
        System.out.println("The first" + limit+"natural numbers are:");
        for (int i = 1; i <=limit ; i++)
        {
            System.out.println(i+ " ");
            sum += i;

        }
        System.out.println("\nThe sum of the first" + limit +"natural number is:" + sum);

    }
}
