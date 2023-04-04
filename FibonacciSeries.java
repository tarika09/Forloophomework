import java.util.Scanner;

public class FibonacciSeries {
    // 0 1 1 2 3 5 8
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=a+b;
        System.out.println("Enter nth  term");//print the term
        Scanner scanner=new Scanner(System.in);
        int term = scanner.nextInt();
        for (int i =1 ; i <=term ; i++)
        {
            System.out.println(a+" ");
            //calculate the term
            c=a+b;
            a=b;
            b=c;


        }
    }
}
