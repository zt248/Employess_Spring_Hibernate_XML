package dao.impl;

import dao.DaoException;
import dao.DepartmentDAO;
import model.Department;
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
public class DepartmentDaoImpl extends SessionUtil implements DepartmentDAO {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void add(Department department) throws DaoException {

        Session session = this.sessionFactory.getCurrentSession();
        session.save(department);

    }

    @Override
    public List<Department> getAll() throws DaoException {

//        String sql = "SELECT * FROM Department";
//
//        Session session = getSession();
//        Query query = session.createNativeQuery(sql).addEntity(Department.class);
//        List<Department> DepartmentList = query.getResultList();
        Session session = this.sessionFactory.getCurrentSession();
        List<Department> departmentList = session.createQuery("from Department").list();


        return departmentList;
    }

    @Override
    public Department getById(Long id) throws DaoException {

        Session session = this.sessionFactory.getCurrentSession();
        Department department = session.get(Department.class, new Long(id));

//        String sql = "SELECT * FROM Department WHERE id = :Department_id";
//        Session session = getSession();
//        Query query = session.createNativeQuery(sql).addEntity(Department.class);
//        query.setParameter("Department_id", id);//
//        Department Department = (Department) query.getSingleResult();


        return department;
    }

    @Override
    public void update(Department department) throws DaoException {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(department);

    }

    @Override
    public void remove(Department department) throws DaoException {
        Session session = this.sessionFactory.getCurrentSession();
        session.remove(department);

    }

}
