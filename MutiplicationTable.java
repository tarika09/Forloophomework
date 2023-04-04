import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MutiplicationTable {
    public static void main(String[] args) {
        int number,multiplier;
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a number
        System.out.println("Enter the number ");
        number = scanner.nextInt();
        scanner.close();
        for (multiplier = 1; multiplier <=12 ; multiplier++)
        {
            System.out.printf("%d * %d = %d\n", number, multiplier,(number * multiplier) );

        }

    }




}
