public class StringUtilsAiGenerated {

    // Method to reverse a string
    public static String reverseString(String input) {
        // Use StringBuilder to efficiently reverse the string
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    // Method to capitalize the first letter of a string
    public static String capitalizeString(String input) {
        // Check for null or empty input
        if (input == null || input.isEmpty()) {
            return input;
        }
        // Capitalize the first letter and concatenate the rest of the string
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    // Method to count occurrences of a character in a string
    public static int countOccurrences(String input, char target) {
        int count = 0;
        // Iterate through each character in the input string
        for (char c : input.toCharArray()) {
            // If the character matches the target character, increment the count
            if (c == target) {
                count++;
            }
        }
        return count;
    }
}
