package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 1;
        int del = 1;
        for (; number <= 100; del = number % 7) {
            if (del == 0) {
                System.out.println("Число " + number + " делится на 7!");
                number++;
            } else {
                number++;
            }
        }
    }
}
