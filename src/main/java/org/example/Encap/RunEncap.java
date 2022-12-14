package org.example.Encap;

public class RunEncap {

    public static void main(String[] args) {
        EncapTest encapTest = new EncapTest();

        encapTest.setAge(22);
        encapTest.setIdNum(47);
        encapTest.setName("Hitman");

        System.out.println("Name of the Person -> " +encapTest.getName() + "And the Age is -> "
         + encapTest.getAge() + "Also with the ID -> " + encapTest.getIdNum());

    }
}
