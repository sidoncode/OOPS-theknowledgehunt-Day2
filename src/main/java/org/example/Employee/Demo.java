package org.example.Employee;

public class Demo {

    public static void main(String[] args) {
     Salary salary = new Salary("MR.A","street number123",123,24);
     Employeee employeee = new Employeee("Mr.B","streetnumber 321",44);
     salary.mailcheck();
     employeee.mailcheck();
    }
}
