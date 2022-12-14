package org.example.Employee;
public class Employeee {
    // variables //
    private String name;
    private String address;
    private int number;

    public Employeee(String name, String address, int number) {
        System.out.println("Employee is being Generated.");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public void mailcheck(){
        System.out.println("Within Mailcheck of Employee class");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
