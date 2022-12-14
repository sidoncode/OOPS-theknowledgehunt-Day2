package org.example;
public class Main {

    public static void main(String[] args) {
        System.out.println("Here we are calling the integer add function");
        add(1,2);

        System.out.println("Here we are calling the Float add function");

        add(1.2,4);
    }

    public static void add(int x, int y){
        int result;
        result = x + y;
        System.out.println("The Result is ->" + result);
    }

    public static void add(double a, double b){
        double result1;
        result1 = a + b;
        System.out.println("The Result is ->" + result1);
    }
}