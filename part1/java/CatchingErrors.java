/**
 * @author ahalikov
 */
public class CatchingErrors {

    public static void main(String[] args) {
        try {
            System.out.println("throwing error");
            throw new AssertionError("assertion error");
        } catch(Error e) {
            e.printStackTrace();
        }
    }
}
