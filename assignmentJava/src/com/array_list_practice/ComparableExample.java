package com.array_list_practice;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

 class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private double salary;
    private LocalDate joiningDate;

    public Employee(int id, String name, double salary, LocalDate joiningDate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    // Compare Two Employees based on their ID
    /**
     *    anotherEmployee - The Employee to be compared.
     *   A negative integer, zero, or a positive integer as this employee
     *          is less than, equal to, or greater than the supplied employee object.
    */
    @Override
    public int compareTo(Employee anotherEmployee) {
        return this.getId() - anotherEmployee.getId();
    }

}

public class ComparableExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1010, "Rajeev", 100000.00, LocalDate.of(2010, 7, 10)));
        employees.add(new Employee(1004, "Chris", 95000.50, LocalDate.of(2017, 3, 19)));
        employees.add(new Employee(1015, "David", 134000.00, LocalDate.of(2017, 9, 28)));

        System.out.println("Employees (Before Sorting) : ");
        
        for(int i = 0 ; i < employees.size(); i++) {
        	System.out.println("id "+ employees.get(i).getId());
        	System.out.println("name " + employees.get(i).getName());
        	System.out.println("salary " + employees.get(i).getSalary());
        	System.out.println("joiningDate " + employees.get(i).getJoiningDate());
        }

        // This will use the `compareTo()` method of the `Employee` class to compare two employees and sort them.
        Collections.sort(employees);

        System.out.println("\nEmployees (After Sorting) : ");
        
        for(int i = 0 ; i < employees.size(); i++) {
        	System.out.println("id "+ employees.get(i).getId());
        	System.out.println("name " + employees.get(i).getName());
        	System.out.println("salary " + employees.get(i).getSalary());
        	System.out.println("joiningDate " + employees.get(i).getJoiningDate());
        }
    }
}

