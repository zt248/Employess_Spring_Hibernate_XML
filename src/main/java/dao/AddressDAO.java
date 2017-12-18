package dao;

import model.Address;

import java.util.List;

public interface AddressDAO {

    //CRUD

    //create
    void add(Address address) throws DaoException;

    //read
    List<Address> getAll() throws DaoException;

    Address getById(Long id) throws DaoException;

    //update
    void update(Address address) throws DaoException;


    //detele
    void remove(Address address) throws DaoException;

}
