package dao.impl;

import dao.AddressDAO;
import dao.DaoException;
import model.Address;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class AddressDaoImplTest {

    @Autowired
    private AddressDAO addressImplDao;

    @Test
    public void add() throws DaoException {
        Address address = new Address(null, "Test", "Test", "Test", "Test");
        addressImplDao.add(address);
        Assert.assertEquals(addressImplDao.getById(address.getId()).getId(), address.getId());
        Assert.assertEquals(addressImplDao.getById(address.getId()).getCountry(), address.getCountry());
        Assert.assertEquals(addressImplDao.getById(address.getId()).getCity(), address.getCity());
        Assert.assertEquals(addressImplDao.getById(address.getId()).getStreet(), address.getStreet());
        Assert.assertEquals(addressImplDao.getById(address.getId()).getPostCode(), address.getPostCode());
        addressImplDao.remove(address);
    }

    @Test
    public void getAll() throws DaoException {
        Address address = new Address(null, "Test", "Test", "Test", "Test");
        addressImplDao.add(address);
        List<Address> list = addressImplDao.getAll();
        Assert.assertNotNull(list);
        Assert.assertTrue(list.size() > 0);
        addressImplDao.remove(address);
    }

    @Test
    public void getById() throws DaoException {
        Address address = new Address(null, "Test", "Test", "Test", "Test");

        addressImplDao.add(address);
        Assert.assertEquals(addressImplDao.getById(address.getId()).getId(), address.getId());
        Assert.assertEquals(addressImplDao.getById(address.getId()).getCountry(), address.getCountry());
        Assert.assertEquals(addressImplDao.getById(address.getId()).getCity(), address.getCity());
        Assert.assertEquals(addressImplDao.getById(address.getId()).getStreet(), address.getStreet());
        Assert.assertEquals(addressImplDao.getById(address.getId()).getPostCode(), address.getPostCode());
        addressImplDao.remove(address);
    }

    @Test
    public void update() throws DaoException {
        Address address = new Address(null, "Test", "Test", "Test", "Test");

        addressImplDao.add(address);
        Assert.assertEquals(addressImplDao.getById(address.getId()).getId(), address.getId());
        address.setCity("New City");
        address.setCountry("New Country");
        address.setStreet("new Street");
        address.setPostCode("new PostCode");
        addressImplDao.update(address);
        Assert.assertEquals(addressImplDao.getById(address.getId()).getCity(), address.getCity());
        Assert.assertEquals(addressImplDao.getById(address.getId()).getCountry(), address.getCountry());
        Assert.assertEquals(addressImplDao.getById(address.getId()).getCity(), address.getCity());
        Assert.assertEquals(addressImplDao.getById(address.getId()).getStreet(), address.getStreet());
        Assert.assertEquals(addressImplDao.getById(address.getId()).getPostCode(), address.getPostCode());
        addressImplDao.remove(address);
    }

    @Test
    public void remove() throws DaoException {
        Address address = new Address(null, "Test", "Test", "Test", "Test");
        addressImplDao.add(address);
        Assert.assertNotNull(addressImplDao.getById(address.getId()).getId());
        addressImplDao.remove(address);
        try {
            Assert.assertNull(addressImplDao.getById(address.getId()).getId());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}