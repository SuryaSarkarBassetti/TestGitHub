package com.example.demo;

public class App {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("Hello from Demo Java Project!");
        System.out.println("2 + 85 = " + add(2, 85));
        System.out.println("2 * 85 = " + multiply(2, 85));
    }
}
