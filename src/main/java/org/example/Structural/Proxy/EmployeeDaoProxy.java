package org.example.Structural.Proxy;

public class EmployeeDaoProxy implements EmployeeDao {
    private EmployeeDao employeeDaoObj;
    private String clientRole;

    public EmployeeDaoProxy(String clientRole) {
        this.employeeDaoObj = new EmployeeDaoImpl();
        this.clientRole = clientRole;
    }

    @Override
    public void getEmployeeInfo() {
        if(clientRole.equals("ADMIN") || clientRole.equals("USER")){
            employeeDaoObj.getEmployeeInfo();
        } else {
            throw new RuntimeException("Access Denied");
        }
    }

    @Override
    public void createEmployee(EmployeeDao obj) {
        if(clientRole.equals("ADMIN")){
            employeeDaoObj.createEmployee(obj);
        } else {
            throw new RuntimeException("Access Denied");
        }
    }
}
