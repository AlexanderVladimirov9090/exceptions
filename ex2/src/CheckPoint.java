/**
 * Created by clouway on 10.05.16.
 */
public class CheckPoint {

    private final int min;
    private final int max;

    public CheckPoint(int min, int max) {
        this.max = max;
        this.min = min;
    }

    /**
     * Checking number if it out of bounds
     *
     * @param number checked number
     * @throws OutOfBoundException
     */
    public void check(int number) throws OutOfBoundException {
        if (number < min || number > max) {
            throw new OutOfBoundException();
        }
    }
}
