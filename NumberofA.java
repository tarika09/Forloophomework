import java.util.Scanner;

public class NumberofA {



    void a (String str){
        int count = 0;
        for (int i = 0; i <str.length() ; i++)
        {
            char ch = str.charAt(i);
            if ((ch =='a' || (ch == 'A')))
                count++;
            
        }
        System.out.println("Number of a : "+count);
            
        }

    public static void main(String[] args) {

       NumberofA obj = new NumberofA();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input :");
        String str = scanner.next();
        obj.a (str);
    }





    }


