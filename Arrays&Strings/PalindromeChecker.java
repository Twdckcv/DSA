import java.util.Scanner;

public class PalindromeChecker {

    public static boolean checkIfPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }   
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();

        boolean isPalindrome = checkIfPalindrome(input);

        if (isPalindrome) {
            System.out.println("The string '" + input + "' is a palindrome.");
        } else {
            System.out.println("The string '" + input + "' is not a palindrome.");
        }

        scanner.close();
    }
}