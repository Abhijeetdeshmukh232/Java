package com.company;

public class demo6 {
    public static void main(String[] args) {
    int rows = 0;

    for (int i = 5; i >= 0; i--) {
        for (int j = 1; j <= i; ++j) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
}
