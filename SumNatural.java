import java.util.Scanner;

public class SumNatural {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter any number");

            int number = scanner.nextInt();
            int sum=0;
            for (int i = 1; i <=number ; i++)
            {
                System.out.println("i=" +i);
                System.out.println("sum" +(sum+=i));

            }
            System.out.println(" Sum of" +number+ "natural number= " +sum);

        }
    }


