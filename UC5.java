/**
 * OOPSBannerApp - UC5 Implementation
 * Displays "OOPS" banner using compact array initialization
 * with String.join() and enhanced for-loop.
 *
 * @author Adithyan
 * @version 5.0
 */
public class OOPSBannerApp {

    /**
     * Main method - Entry point of the application
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        // Array declaration + initialization in single statement
        String[] banner = {
                String.join("   ", " ***** ", " ***** ", " ***** ", "****** "),
                String.join("   ", "*     *", "*     *", "*     *", "*     *"),
                String.join("   ", "*     *", "*     *", "*     *", "*     *"),
                String.join("   ", "*     *", "*     *", "*     *", "****** "),
                String.join("   ", "*     *", "*     *", "*     *", "*      "),
                String.join("   ", "*     *", "*     *", "*     *", "*      "),
                String.join("   ", " ***** ", " ***** ", " ***** ", "*      ")
        };

        // Loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}