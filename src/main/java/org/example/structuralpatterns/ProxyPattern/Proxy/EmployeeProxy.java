package org.example.structuralpatterns.ProxyPattern.Proxy;

import org.example.structuralpatterns.ProxyPattern.Subject.Employee;
import org.example.structuralpatterns.ProxyPattern.Subject.EmployeeDao;

public class EmployeeProxy implements EmployeeDao {
    String client;
    Employee empl;
    EmployeeDao emplDao;
    public EmployeeProxy(EmployeeDao emplDao){
        this.emplDao = emplDao;
    }

    @Override
    public void create(String client, Employee employeeObj) throws Exception {
       if(client.equals("ADMIN")){
           emplDao.create(client, employeeObj);
           return;
       }
       throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, Employee employeeObj) throws Exception {
        if(client.equals("ADMIN")){
            emplDao.delete(client, employeeObj);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public Employee get(String client, Employee employeeObj) throws Exception {
        if(client.equals("ADMIN") || client.equals("USER")){
           return emplDao.get(client, employeeObj);
        }
        throw new Exception();
    }
}
