package com.company;

public class demo4 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
