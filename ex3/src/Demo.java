import java.lang.*;

/**
 * Created by clouway on 10.05.16.
 */
public class Demo {
    public static void main(String[] args) {

        FixedList fixedList = new FixedList(3);
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();

        try {
            fixedList.add(object1);
            fixedList.add(object2);
            fixedList.add(object3);

            fixedList.printAllElements();

            fixedList.remove();
            System.out.println();
            System.out.println();
            fixedList.printAllElements();
            System.out.println();
            fixedList.remove();
            fixedList.printAllElements();
            System.out.println();
            fixedList.remove();
            fixedList.printAllElements();

            fixedList.remove();
        } catch (ListFullException e) {
            e.printStackTrace();
        }
        catch (ListEmptyException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
