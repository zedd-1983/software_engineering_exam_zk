/*
    EmployeeList class storing employees
    Author: Zdenek Krousky
    g00267758
 */

package ie.gmit;

import java.util.ArrayList;

public class EmployeeList {

    private static int employeeCount = 0;
    private ArrayList<Employee> employeeList;

    public EmployeeList() {
        throw new IllegalArgumentException("Need to provide parameters to create employee list");
    }

    public EmployeeList(ArrayList<Employee> employeeList) {
        if(employeeList == null) {
            throw new IllegalArgumentException("Need to provide EmployeeList as parameter");
        } else {
            this.employeeList = employeeList;
        }
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public static void setEmployeeCount(int employeeCount) {
        EmployeeList.employeeCount = employeeCount;
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void addEmployee(Employee emp) {
        for(Employee storedEmp : employeeList ) {
            if(storedEmp.getId() == emp.getId()) {
                throw new IllegalArgumentException("Employee already exists");
            } else {
                this.employeeCount++;
                this.employeeList.add(emp);
            }
        }
    }

    public int getListSize() {
        return this.employeeList.size();
    }
}
