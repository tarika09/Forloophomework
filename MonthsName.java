import java.util.Scanner;

public class MonthsName {
    Scanner scanner = new Scanner(System.in);

    //no return//no parameter
    void monthsname() {
        System.out.println("Enter any number 1 to 12");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("1st month is January");
                break;
            case 2:
                System.out.println("2nd month is February");
                break;
            case 3:
                System.out.println("3rd month is March");
                break;
            case 4:
                System.out.println("4th month is April");
                break;
            case 5:
                System.out.println("5th month is May");
                break;
            case 6:
                System.out.println("6th month is June");
                break;
            case 7:
                System.out.println("7th month is July");
                break;
            case 8:
                System.out.println("8th month is August");
                break;
            case 9:
                System.out.println("9th month is September");
                break;
            case 10:
                System.out.println("10th month is October");
                break;
            case 11:
                System.out.println("11th month is November");
                break;
            case 12:
                System.out.println("12th month is December");
                break;
            default:
                System.out.println("Invalid");


        }
    }


    public static void main(String[] args) {
        MonthsName monthsname = new MonthsName();
        monthsname.monthsname();
    }
}
