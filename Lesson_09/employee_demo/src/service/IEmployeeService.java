package service;

import model.Employee;

public interface IEmployeeService {

    void addNewEmployee(Employee e);

    void updateName(Employee e, String newName);

    void deleteEmployee(Employee e);
}
