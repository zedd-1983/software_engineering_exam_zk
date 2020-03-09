package ie.gmit;

import java.util.ArrayList;

public class EmployeeList {

    private static int employeeCount = 0;
    private ArrayList<Employee> employeeList;

    public EmployeeList() {
    }

    public EmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
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
        this.employeeCount++;
        this.employeeList.add(emp);
    }

    public int getListSize() {
        return this.employeeList.size();
    }
}
