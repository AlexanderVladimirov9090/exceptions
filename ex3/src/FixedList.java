import java.lang.*;

/**
 * Created by clouway on 11.05.16.
 */
public class FixedList {
    private final Object[] items;
    private int index = 1;

    public FixedList(int size) {
        this.items = new Object[size];
    }

    /**
     * Adding item in items array.
     *
     *
     * @param item Object that is added
     * @throws ListFullException
     */
    public void add(Object item) throws ListFullException {
        if (index < items.length) {
            items[index] = item;
            index++;
        } else {
            throw new ListFullException();
        }
    }

    /**
     * Removes object from array.
     *
     * @throws ListEmptyException
     */
    public void remove() throws ListEmptyException {

        if (items[index - 1]==null) {
            throw new ListEmptyException();
        } else {
            items[index - 1] = null;
            index--;
        }
    }

    /**
     * Prints all array as a string
     */
    public void printAllElements() {

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }
}