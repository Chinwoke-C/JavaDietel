package StringBuilderPractices;

import java.util.Scanner;

public class PalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String user_input = input.nextLine();

        System.out.println("Ignoring nonalphanumeric characters, \nis " + user_input + " a palindrome? " + isPalindrome(user_input));

    }
    public static  boolean isPalindrome(String user_input){
        String output1 = filter(user_input);
        String output2 = reverse(output1);
        return output2.equals(output1);
    }

    public static String filter(String user_input) {
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < user_input.length(); i++) {
            if (Character.isLetterOrDigit(user_input.charAt(i))){
                build.append(user_input.charAt(i));
            }

        }
        return build.toString();
    }
    public static String reverse(String user_input) {
        StringBuilder builder = new StringBuilder(user_input);
        builder.reverse();
        return builder.toString();
    }


    }


