import java.util.Scanner;

public class DividedBy {
    public static void main(String[] args) {
        int lower ;
        int upper;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write lower limit");
        lower = scanner.nextInt();
        System.out.println("Write upper limit");
        upper = scanner.nextInt();

        System.out.println("\nDivided by 3: ");
		for (int i=lower; i<=upper; i++)
        {
        if (i%3==0)
            System.out.print(i +", ");
        }

		System.out.println("\n\nDivided by 5: ");
        for (int j =lower ; j <=upper ; j++)
        {

        if (j%5==0)
            System.out.print(j +", ");
        }


    }

}


