package org.example.Inheritance;
class Calculation {
    int z;
    public void addition(int x, int y){
        z = x  +y;
        System.out.println("The sum of the given number -> " + z);
    }
    public void substraction(int a, int b){
        z = a  - b;
        System.out.println("The sum of the given number -> " + z);
    }
}

public class Mycalculation extends Calculation{
    public void multiplication(int x, int y){
        z = x * y;
        System.out.println("The product of the multiplication Operation is -> " + z);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Mycalculation demo = new Mycalculation();
        demo.addition(a,b);
        demo.substraction(a,b);
        demo.multiplication(a,b);
    }
}
