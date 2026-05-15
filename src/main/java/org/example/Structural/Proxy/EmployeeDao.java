package org.example.Structural.Proxy;

public interface EmployeeDao {
    void getEmployeeInfo();
    void createEmployee(EmployeeDao obj);
}
