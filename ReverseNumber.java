import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


public class ReverseNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //captured input would be stored in the number num

        System.out.println("Enter a number to reverse:");
        //this statement will capture the user input
        int num = scanner.nextInt();
        int reversed = 0;

        for (int i = num; i != 0; i /= 10) //No increment/decrement part as logic

        {
            int digit = i % 10;
            reversed = reversed * 10 + digit;
        }


        System.out.println("Reversed Number:" + reversed);


    }
}






