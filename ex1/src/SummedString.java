import static java.lang.Integer.parseInt;

/**
 * Created by clouway on 09.05.16.
 */
public class SummedString {

  /**
   * Sum two strings parsed to integer
   *
   * @param one first string
   * @param two second string
   * @return String
   */
  public String sum(String one, String two) throws NotIntegerException {
    try {
      return String.valueOf(parseInt(one) + parseInt(two));
    } catch (NumberFormatException e) {
      throw new NotIntegerException();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return "Not a number.";
  }
}
