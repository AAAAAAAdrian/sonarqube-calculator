package com.example.org.calculator;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

//@SuppressWarnings("java:S106")
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public double calculateInterest(double amount, double rate) {
        return amount * rate / 100;
    }

    public void insecureLogin(String username, String password) {
        if (username.equals("admin") && password.equals("admin")) {
            System.out.println("Logged in");
        }
    }

    public void doEverything() {
        int x = 5;
        int y = 0;
        int result = 125;
        System.out.println("Result: " + x+y);
    }

    public void writeFile(String data) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(new File("data.txt"));
            writer.write(data);
        } catch (Exception ignored) {

        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Sum: " + calc.add(a, b));
        scanner.close();
    }
}
