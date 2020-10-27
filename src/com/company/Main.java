package com.company;

import constructor.DataType;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DataType dataType = new DataType();


        Scanner scanner = new Scanner(System.in);

        scanner.next();

         boolean resut;
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("ahmedelhilali");
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.toString());

        String input = "abcd";

        System.out.println(doubleChar(input));


        String[] dogs = {"dog", "dag", "dug", "deg", "dig"};
        int count = 0;
        for (int i = 0; i < input.length() - 2; i++) {
            String str = input.substring(i, i + 3);
            for (int j = 0; j < dogs.length; j++) {
                if (dogs[j].equals(str)) {
                    count++;
                }
            }
        }
        // System.out.println(count);
    }

    public static String doubleChar(String str) {
        String stringchar = "";
        for (int i = 0; i < str.length(); i++) {
            stringchar += str.substring(i, i + 1) + str.substring(i, i + 1);
        }
        return stringchar;
    }

}

