package org.example.structuralpatterns.ProxyPattern.Subject;

public class EmployeeImpl implements EmployeeDao{

    @Override
    public void create(String client, Employee employeeObj) throws Exception {
        System.out.println("Employee Object Created");
    }

    @Override
    public void delete(String client, Employee employeeObj) throws Exception {
        System.out.println("Employee Object Deleted");
    }

    @Override
    public Employee get(String client, Employee employeeObj) throws Exception {
        employeeObj.setName("Sajal");
        employeeObj.setAddress("India");
        return employeeObj;
    }
}
