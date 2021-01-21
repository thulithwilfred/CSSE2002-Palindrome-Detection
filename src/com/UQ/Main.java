package com.UQ;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner usrIn = new Scanner(System.in);
        String stringToTest;

        while(true) {

            if (parseInputs(usrIn)) {

                stringToTest = usrIn.nextLine();

                if (!parseFormat(stringToTest)) {
                    continue;
                }

                if(isPal2(stringToTest)) {
                    System.out.println(stringToTest + " is Palindrome");
                }else {
                    System.out.println(stringToTest + "is not Palindrome");
                }

            } else {
                printUsage();
            }
        }
    }

    /* Use while loop, for Checking */
    public static boolean isPal2(String word) {
        int wordLen = word.length();
        char [] testWord = new char [wordLen];
        int count = 0;

        while (--wordLen >= 0)  {
            testWord[count] = word.charAt(wordLen);
            count++;
        }
        String wordReversed = new String(testWord);
        System.out.println(wordReversed);

        return word.equals(wordReversed);
    }


    /* Use a for loop, for checking */
    public static boolean isPal1(String word) {

        int wordLen = word.length();
        char [] testWord = new char [wordLen];
        int count = 0;

        for (int i = wordLen - 1; i >= 0; i--) {
            testWord[count] = word.charAt(i);
            count++;
        }

        String wordReversed = new String(testWord);
        System.out.println(wordReversed);

        return word.equals(wordReversed);
    }

    /* Prints Usage */
    public static void printUsage() {
        System.out.println("Usage: 'String to Test' ");
    }

    /* Checks String for Letters, Error Printed Else */
    public static boolean parseFormat(String word) {

        char[] charArr = word.toCharArray();

        for (char c : charArr) {
            if(Character.isDigit(c) || !Character.isAlphabetic(c)) {
                System.out.println("Enter Letters Only...");
                return false;
            }
        }
        return true;
    }

    /* Checks that input is valid */
    public static boolean parseInputs(Scanner usrIn) {
        return usrIn.hasNext();
    }

}
