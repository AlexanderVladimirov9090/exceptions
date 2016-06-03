import java.util.Scanner;

/**
 * Created by clouway on 10.05.16.
 */
public class Demo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input number");
        int number = keyboard.nextInt();

        CheckPoint checker = new CheckPoint(0, 100);
        CheckPoint checker2 = new CheckPoint(10, 20);

        try {
            checker.check(number);
            System.out.println(number);
        } catch (OutOfBoundException e) {
            e.printStackTrace();
        }

        try{
            checker2.check(number);
            System.out.println(number);
        }
        catch (OutOfBoundException e){
            e.printStackTrace();
        }
    }
}