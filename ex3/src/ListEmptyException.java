/**
 * Created by clouway on 10.05.16.
 */
public class ListEmptyException extends Exception {

    public ListEmptyException() {
        super("Can not remove list is empty");
    }
}
