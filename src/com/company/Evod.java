package com.company;

import java.util.Scanner;

public class Evod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a % 2 == 0 ? "Even" : "Odd");

    }
}
