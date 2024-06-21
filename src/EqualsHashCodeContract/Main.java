package EqualsHashCodeContract;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();
        employees.add(new Employee(1,"Ravi"));
        employees.add(new Employee(2,"Ravi"));
        employees.add(new Employee(3,"Ravi"));


        for(Employee employee : employees) {
            System.out.println(employee.getId()+" "+ employee.getName() + " "+ employee.hashCode());
        }
    }

}
