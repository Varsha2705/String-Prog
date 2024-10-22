import java.util.*;

public class CountWords {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // Initialize word count
        int count = 0;
        boolean inWord = false; // To track if we are inside a word

        // Loop through each character in the string
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            // Check if the character is a space
            if (ch == ' ') {
                // If we were in a word, it means we found the end of a word
                if (inWord) {
                    count++;
                    inWord = false; // We are no longer in a word
                }
            } else {
                // If it's not a space, we are in a word
                inWord = true;
            }
        }

        // If the last character was not a space, count the last word
        if (inWord) {
            count++;
        }

        // Print the word count
        System.out.println("Number of words: " + count);
    }
}
