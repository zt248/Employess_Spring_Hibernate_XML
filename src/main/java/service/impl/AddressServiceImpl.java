package service.impl;

import dao.AddressDAO;
import dao.DaoException;
import model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.AddressService;

import java.util.List;

@Service (value = "AddressServiceImpl")
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressDAO addressDao;


    @Override
    public void add(Address address) throws DaoException {
        this.addressDao.add(address);
    }

    @Override
    public List<Address> getAll() throws DaoException {
        return this.addressDao.getAll() ;
    }

    @Override
    public Address getById(Long id) throws DaoException {
        return this.addressDao.getById(id);
    }

    @Override
    public void update(Address address)  throws DaoException{
        this.addressDao.update(address);
    }

    @Override
    public void remove(Address address) throws DaoException {
        this.addressDao.remove(address);
    }
}
