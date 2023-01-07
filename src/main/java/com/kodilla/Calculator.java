package com.kodilla;

public class Calculator {
    public void adding() {
        int one = 1;
        int two = 2;
        int addResult = one + two;
        System.out.println("1 + 2 = " + addResult);
    }
    public void substraction() {
        int three = 3;
        int four = 4;
        int subResult = four - three;
        System.out.println("4 - 3 = " + subResult);
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.adding();
        calculator.substraction();
    }
}