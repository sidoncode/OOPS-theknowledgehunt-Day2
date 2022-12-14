package org.example.Employee;

public class Salary extends Employeee{
    private double salary;

    public Salary(String name, String address, int number,double salary) {
        super(name, address, number);
        setSalary(salary);
    }
    public void mailcheck(){
        System.out.println("Within Mailcheck of Salary class");
        System.out.println("Mailing Check to " + getName() + "With Salary" + salary);
    }
    public void setSalary(double newsalary) {
        if(newsalary >=0.0){
            salary = newsalary;
        }
    }

    public double getSalary() {
        return salary;
    }
    public double computePay(){
        System.out.println("Computing salary Pay for" + getName());
        return salary/23;
    }
}
