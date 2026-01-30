package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    static boolean testAdd() {
        assertEquals(3, App.add(1, 2));
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Hello from Demo Java Project!");
        System.out.println(AppTest.testAdd());
    }
}
