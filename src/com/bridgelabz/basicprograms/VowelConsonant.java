package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {

    	System.out.println("Enter a character :");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);  

        switch (ch) {
        case 'a':
        case 'A':
        case 'e':
        case 'E':
        case 'i':
        case 'I':
        case 'o':
        case 'O':
        case 'u':
        case 'U':
            System.out.println(ch + " is vowel");
            break;
        default:
            System.out.println(ch + " is consonant");
    }

    }
}