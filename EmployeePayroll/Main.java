package EmployeePayroll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Name: ");
        String empName = sc.nextLine();
        sc.nextLine();

        System.out.println("Enter Employee Salary: ");
        double empSalary = sc.nextDouble();

        Employee emp = new Employee(empName, empSalary);

        System.out.println("Enter Manager Name: ");
        String manName = sc.nextLine();
        sc.nextLine();

        System.out.println("Enter Manager Salary: ");
        double manSalary = sc.nextDouble();

        System.out.println("Enter Manager Bonus: ");
        double manBonus = sc.nextDouble();

        Manager man = new Manager(manName, manSalary, manBonus);

        System.out.println(emp.calculateSalary());
        System.out.println(man.calculateSalary());
    }
}
