package org.example.Structural.Proxy;

public class EmployeeManagement {
    public static void main(String[] args) {
        System.out.println("===== Proxy Design Pattern =====");

        EmployeeDao userProxyObj = new EmployeeDaoProxy("USER");
        userProxyObj.getEmployeeInfo(); //access granted
        userProxyObj.createEmployee(new EmployeeDaoImpl()); //access denied
    }
}
