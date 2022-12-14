package org.example.Inheritance;
// Heirarchical inheritace //
// when 2 or more classes, inherits the same single class, then this type of inheritance is called heirarchical
class Human{
    void eat(){
        System.out.println("Eating in the  - Human Class");
    }
}
class Female extends Human{
    void Makeup(){
        System.out.println("Makeup in the  - Female Class");
    }
}
class Male extends Human{
    void Dressup(){
        System.out.println("Dressup in the  - Male Class");
    }
}

public class TestInheritance3 {
    public static void main(String[] args) {
        Male male = new Male();
        male.eat();
        male.Dressup();
        // C.E -> male.Makeup();
        Female female = new Female();
        female.Makeup();
        female.eat();
    }
}
