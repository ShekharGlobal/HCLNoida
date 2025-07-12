package com.hcl.bon;
import java.util.Scanner;

public class SubstitutionCipherDecryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the encrypted text:");
        String input = sc.nextLine();

        StringBuilder decrypted = new StringBuilder();
        boolean hasLetters = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isUpperCase(ch)) {
                char shifted = (char)(ch - 7);
                if (shifted < 'A') {
                    shifted = (char)(shifted + 26);
                }
                decrypted.append(shifted);
                hasLetters = true;
            }
            else if (Character.isLowerCase(ch)) {
                char shifted = (char)(ch - 7);
                if (shifted < 'a') {
                    shifted = (char)(shifted + 26);
                }
                decrypted.append(shifted);
                hasLetters = true;
            }
            else if (ch == ' ') {
                decrypted.append(' ');
            }
            // else ignore other characters
        }

        if (hasLetters) {
            System.out.println("Decrypted text:");
            System.out.println(decrypted.toString());
        } else {
            System.out.println("No hidden message");
        }

        sc.close();
    }
}
