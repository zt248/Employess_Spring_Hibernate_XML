package dao;

import model.Department;

import java.util.List;

public interface DepartmentDAO {
    //create
    void add(Department department) throws DaoException;

    //read
    List<Department> getAll() throws DaoException;

    Department getById(Long id) throws DaoException;

    //update
    void update(Department department) throws DaoException;

    //delete
    void remove(Department department) throws DaoException;
    
}
