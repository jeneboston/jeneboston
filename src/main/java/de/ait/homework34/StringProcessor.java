package de.ait.homework34;

public class StringProcessor {
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public int getLength(String str) {
        return str.length();
    }

    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public boolean isPalindrome(String str) {
        String reversed = reverse(str);
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        StringProcessor processor = new StringProcessor();

        // Example usage
        String str1 = "hello1";
        String str2 = "world2";

        System.out.println("Concatenated string: " + processor.concatenate(str1, str2));
        System.out.println("Length of string: " + processor.getLength(str1));
        System.out.println("Reversed string: " + processor.reverse(str1));
        System.out.println("Is 'hello' a palindrome? " + processor.isPalindrome("hello"));
    }
}