package com.practicalexercises1;
import java.io.*;
public class Test {
    public static void main(String[] args)
    {
        int n = 3;
        String names[] = { "Sind", "Kris", "Alen"};
        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (names[j].compareTo(names[i]) > 0) {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        System.out.println("The names in reverse alphabetical order are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
    }
}