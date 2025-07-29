package org.example.structuralpatterns.ProxyPattern.Client;

import org.example.structuralpatterns.ProxyPattern.Proxy.EmployeeProxy;
import org.example.structuralpatterns.ProxyPattern.Subject.Employee;
import org.example.structuralpatterns.ProxyPattern.Subject.EmployeeImpl;

public class ClientMain {
    public static void main(String[] args) {
        Employee empl = new Employee("Sajal", "India");
        EmployeeImpl emplImpl = new EmployeeImpl();
        EmployeeProxy proxy = new EmployeeProxy(emplImpl);
        try {
            proxy.delete("ADMIN", empl);
            Employee obj = proxy.get("ADMIN", empl);
            System.out.println("Employee Object " +obj);
        } catch (Exception e) {
            System.out.println("Exception Encountered");
        }

    }
}
