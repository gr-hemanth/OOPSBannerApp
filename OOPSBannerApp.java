/**
 * OOPSBannerApp
 *
 * UC5: Render OOPS as Banner using Inline Array Initialization
 *
 * @author Hemanth
 * @version 5.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] lines = {
            String.join(" ", "  ***     ", "  ***     ", " *****   ", " ***** "),
            String.join(" ", " ** **    ", " ** **    ", " **  **  ", " **    "),
            String.join(" ", "**   **   ", "**   **   ", " **   ** ", " **    "),
            String.join(" ", "**   **   ", "**   **   ", " *****   ", " ***   "),
            String.join(" ", "**   **   ", "**   **   ", " **      ", "   **  "),
            String.join(" ", " ** **    ", " ** **    ", " **      ", "   **  "),
            String.join(" ", "  ***     ", "  ***     ", " **      ", " ***** ")
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }
}