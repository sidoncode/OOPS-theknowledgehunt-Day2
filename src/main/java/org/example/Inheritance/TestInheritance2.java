package org.example.Inheritance;
// demo of - multi level inheritance //
class Animal{
    void eat(){
        System.out.println("Eating in the Animal Class");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barking in the Dog Class");
    }
}
class Babydog extends Dog{
    void weep(){
        System.out.println("Weeping in the Babydog Class");
    }
}
public class TestInheritance2 {
    public static void main(String[] args) {
        Babydog babydog = new Babydog();
        babydog.weep();
        babydog.bark();
        babydog.eat();
    }
}
