/**
 * OOPSBannerApp
 *
 * UC7: Store Character Pattern in a Class
 *
 * @author Hemanth
 * @version 7.0
 */
public class OOPSBannerApp {

    /**
     * CharacterPatternMap - Inner static class
     * Encapsulates a character and its ASCII pattern
     */
    static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor
         * @param character the character
         * @param pattern the ASCII pattern (7 lines)
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Creates and initializes pattern mappings
     * @return array of CharacterPatternMap
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];

        // Pattern for O
        charMaps[0] = new CharacterPatternMap('O', new String[]{
                "  ***     ",
                " ** **    ",
                "**   **   ",
                "**   **   ",
                "**   **   ",
                " ** **    ",
                "  ***     "
        });

        // Pattern for P
        charMaps[1] = new CharacterPatternMap('P', new String[]{
                " *****   ",
                " **  **  ",
                " **   ** ",
                " *****   ",
                " **      ",
                " **      ",
                " **      "
        });

        // Pattern for S
        charMaps[2] = new CharacterPatternMap('S', new String[]{
                " ***** ",
                " **    ",
                " **    ",
                " ***   ",
                "   **  ",
                "   **  ",
                " ***** "
        });

        // Pattern for Space
        charMaps[3] = new CharacterPatternMap(' ', new String[]{
                "         ",
                "         ",
                "         ",
                "         ",
                "         ",
                "         ",
                "         "
        });

        return charMaps;
    }

    /**
     * Retrieves pattern for given character
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        // return space pattern if not found
        return getCharacterPattern(' ', charMaps);
    }

    /**
     * Prints message as ASCII banner
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        for (int line = 0; line < 7; line++) {

            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                sb.append(pattern[line]).append(" ");
            }

            System.out.println(sb);
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}