package dao.impl;

import dao.AddressDAO;
import dao.DaoException;
import model.Address;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public class AddressDaoImpl implements AddressDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(Address address) throws DaoException {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(address);


//        String qlString = "insert into ADDRESS (COUNTRY,CITY,STREET,POST_CODE) values (?,?,?,?)";
//        Query query = entityManager.createNativeQuery(qlString);
//        query.setParameter(1, address.getCountry());
//        query.setParameter(2, address.getCity());
//        query.setParameter(3, address.getStreet());
//        query.setParameter(4, address.getPostCode());
//        int result = query.executeUpdate();
//
//        return result > 0;
    }

    @Override
    public List<Address> getAll() throws DaoException {


        Session session = this.sessionFactory.getCurrentSession();
        List<Address> addressList = session.createQuery("from Address").list();


        return addressList;
    }

    @Override
    public Address getById(Long id) throws DaoException {

        Session session = this.sessionFactory.getCurrentSession();
        Address address = session.get(Address.class, new Long(id));

        return address;
    }

    @Override
    public void update(Address address) throws DaoException {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(address);

    }

    @Override
    public void remove(Address address) throws DaoException {

        Session session = this.sessionFactory.getCurrentSession();
        session.remove(address);


    }

}
