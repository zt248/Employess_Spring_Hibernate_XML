package dao.impl;

import dao.DaoException;
import dao.EmployeeDAO;
import model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import util.SessionUtil;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class EmployeeDaoImpl extends SessionUtil implements EmployeeDAO {


    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(Employee employee) throws DaoException {

        Session session = this.sessionFactory.getCurrentSession();
        session.save(employee);

    }

    @Override
    public List<Employee> getAll() throws DaoException {

        Session session = this.sessionFactory.getCurrentSession();
        List<Employee> employeeList = session.createQuery("from Employee ").list();


        return employeeList;
    }

    @Override
    public Employee getById(Long id) throws DaoException {


        Session session = this.sessionFactory.getCurrentSession();
        Employee employee = session.get(Employee.class, new Long(id));


//        String sql = "SELECT * FROM employee WHERE id = :employee_id";
//        Session session = getSession();
//        Query query = session.createNativeQuery(sql).addEntity(employee.class);
//        query.setParameter("employee_id", id);//
//        employee employee = (employee) query.getSingleResult();

        return employee;
    }

    @Override
    public void update(Employee employee) throws DaoException {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(employee);

    }

    @Override
    public void remove(Employee employee) throws DaoException {
        Session session = this.sessionFactory.getCurrentSession();
        session.remove(employee);

    }
}
