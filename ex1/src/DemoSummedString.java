/**
 * Created by clouway on 09.05.16.
 */
public class DemoSummedString {

    public static void main(String[] args) {
        SummedString strings = new SummedString();
        try {

            System.out.println(strings.sum("a9", "-2"));
        } catch (NotIntegerException e) {
            e.printStackTrace() ;
        }
    }
}
