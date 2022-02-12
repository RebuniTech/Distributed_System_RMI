import java.rmi.Naming;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Client {
    static int a,b,sum;

    public static void main(String[] args) {
        try {
            cal rem = (cal) Naming.lookup("//localhost:2015/cal");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the first number");
            a = scanner.nextInt();
            System.out.println("Please enter the second number");
            b = scanner.nextInt();
            sum = rem.add(a,b);
            System.out.println("The sum the numbers  "+ sum);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
