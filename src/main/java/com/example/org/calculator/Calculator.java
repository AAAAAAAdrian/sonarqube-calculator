package com.example.org.calculator;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

//@java.lang.SuppressWarnings("java:S106")
@java.lang.SuppressWarnings("java:S125")  // Suppress commented-out code warning
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

    // BLOCKER: No check for divide by zero
    public int divide(int a, int b) {
        return a / b;
    }

    public double calculateInterest(double amount, double rate) {
        return amount * rate / 100;
    }

    // BLOCKER: Hardcoded credentials + insecure logic
    public void insecureLogin(String username, String password) {
        if (username.equals("admin") && password.equals("admin")) {
            System.out.println("Logged in");
        }
    }

    // BLOCKER: Divide by zero at runtime
    public void doEverything() {
        int x = 5;
        int y = 0;
        int result = divide(x, y); // Division by zero
        System.out.println("Result: " + result);
    }

    public void writeFile(String data) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(new File("data.txt"));
            writer.write(data);
        } catch (Exception ignored) {

        }
//        try (FileWriter writer = new FileWriter("data.txt")) {
//            writer.write(data);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Sum: " + calc.add(a, b));
        scanner.close();

        String nullString = null;
        System.out.println(nullString.length());
//        if (nullString != null) {
//            System.out.println(nullString.length());
//        }
    }
}
