package org.example.structuralpatterns.ProxyPattern.Subject;

public interface EmployeeDao {
    public void create(String client, Employee employeeObj) throws Exception;
    public void delete(String client, Employee employeeObj) throws Exception;
    public Employee get(String client, Employee employeeObj) throws Exception;
}
