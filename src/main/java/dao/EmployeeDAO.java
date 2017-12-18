package dao;

import model.Employee;

import java.util.List;

public interface EmployeeDAO {
    //create
    void add(Employee employee) throws DaoException;

    //read
    List<Employee> getAll() throws DaoException;

    Employee getById(Long id) throws DaoException;

    //update
    void update(Employee employee) throws DaoException;

    //delete
    void remove(Employee employee) throws DaoException;
}
