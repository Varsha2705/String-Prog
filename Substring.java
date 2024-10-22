import java.util.Scanner;

public class Substring{
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the main string
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        // Ask the user to enter the substring to find
        System.out.print("Enter the substring to find: ");
        String substring = scanner.nextLine();

        // Get the length of the main string and the substring
        int mainLength = mainString.length();
        int subLength = substring.length();
        boolean found = false;

        // Loop through the main string
        for (int i = 0; i <= mainLength - subLength; i++) {
            // Check if the substring matches
            boolean match = true;
            for (int j = 0; j < subLength; j++) {
                if (mainString.charAt(i + j) != substring.charAt(j)) {
                    match = false; // Not a match
                    break;
                }
            }

            // If a match is found, print the index
            if (match) {
                System.out.println("Substring found at index: " + i);
                found = true; // Mark as found
                break; // Exit the loop after finding the first occurrence
            }
        }

        // If the substring is not found
        if (!found) {
            System.out.println("Substring not found.");
        }
    }
}
