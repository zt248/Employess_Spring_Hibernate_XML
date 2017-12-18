import dao.AddressDAO;
import dao.DaoException;

import model.Address;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws DaoException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        AddressDAO addressDao =  context.getBean(AddressDAO.class);
        Address address = new Address();
        address.setCity("Севастополь");
        addressDao.add(address);

    }
}