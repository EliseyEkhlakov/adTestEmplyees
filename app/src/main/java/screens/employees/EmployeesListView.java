package screens.employees;

import java.util.List;

import pojo.Employee;

public interface EmployeesListView {
    void showData(List<Employee> employees);
    void showError();
}
