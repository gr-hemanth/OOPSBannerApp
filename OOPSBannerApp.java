/**
 * OOPSBannerApp
 *
 * UC8: Use Map for Character Patterns and Render via Function
 *
 * @author Hemanth
 * @version 8.0
 */

import java.util.HashMap;

public class OOPSBannerApp {

    // Creates and initializes character pattern map
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
                "  ***     ",
                " ** **    ",
                "**   **   ",
                "**   **   ",
                "**   **   ",
                " ** **    ",
                "  ***     "
        });

        charMap.put('P', new String[]{
                " *****   ",
                " **  **  ",
                " **   ** ",
                " *****   ",
                " **      ",
                " **      ",
                " **      "
        });

        charMap.put('S', new String[]{
                " ***** ",
                " **    ",
                " **    ",
                " ***   ",
                "   **  ",
                "   **  ",
                " ***** "
        });

        return charMap;
    }

    // Renders the banner using nested loops
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int height = charMap.get('O').length;

        for (int line = 0; line < height; line++) {

            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {
                sb.append(charMap.get(ch)[line]).append(" ");
            }

            System.out.println(sb);
        }
    }

    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();
        displayBanner("OOPS", charMap);
    }
}