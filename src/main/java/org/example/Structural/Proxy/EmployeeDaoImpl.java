package org.example.Structural.Proxy;

public class EmployeeDaoImpl implements EmployeeDao {
    public void getEmployeeInfo(){
        System.out.println("Fetched employee info");
    }

    public void createEmployee(EmployeeDao obj){
        System.out.println("Creating employee: " + obj);
    }
}
