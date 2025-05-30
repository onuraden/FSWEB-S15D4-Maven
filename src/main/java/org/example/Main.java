package org.example;


import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String input = "Was it a car or a cat I saw ?";
        boolean result = checkForPalindrome(input);
        System.out.println("Palindrome mu?: " + result);

        WorkintechList list = new WorkintechList();
        list.add("Mehmet");
        list.add("Mehmet");
        list.add("Ali");
        list.add("Ali");
        list.add("Zeynep");
        list.add("Zeynep");
        list.sort();
        list.remove("Ali");
        System.out.println(list.size());

        int decimalNumber = 13;
        String binary = convertDecimalToBinary(decimalNumber);
        System.out.println("Binary karşılığı: " + binary);
    }

    public static boolean checkForPalindrome(String input) {
        if (input == null) {
            return false;
        }

        String newInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(Locale.ENGLISH);

        String reversedInput = new StringBuilder(newInput).reverse().toString();

        return newInput.equals(reversedInput);
    }

    public static String convertDecimalToBinary(int number) {
        if (number == 0) {
            return "0";
        }

        String binary = "";

        while (number > 0) {
            int remainder = number % 2;
            binary = remainder + binary;
            number = number / 2;
        }

        return binary;
    }


}

