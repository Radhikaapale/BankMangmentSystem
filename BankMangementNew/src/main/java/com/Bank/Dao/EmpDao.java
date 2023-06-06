package com.Bank.Dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.Bank.Entity.Employee;

@Repository
public class EmpDao {

	@Autowired
	private SessionFactory sf;

	public List<Employee> getAllDetails() {
		Session ss = sf.openSession();
		Criteria cr = ss.createCriteria(Employee.class);
		return cr.list();
	}

	public Employee get() {
		Session ss = sf.openSession();
		Employee sf = ss.get(Employee.class, 1001);
		return sf;
	}

	public String insertDetails(Employee employee) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(employee);
		tr.commit();
		return "Employee Details inserted.....";
	}

	public List<Employee> getEmpSalGret40k() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.gt("salary", "40000"));
		List<Employee> list = criteria.list();
		return list;
	}
	
	public String insertDetailss(List<Employee> employee) {  //multiple employee inserted...
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		for (Employee employee2 : employee) {
			session.save(employee2);
		}
		tr.commit();
		return "Employees Details inserted.....";
	}

	public List<Employee> getEmpSalless40k() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.gt("salary", "40000"));
		List<Employee> list = criteria.list();
		return list;
	}
	
	

	public String deleteEmployeeDetails(int employeeid) {
		Session session = sf.openSession();
		Transaction tr= session.beginTransaction();
	Criteria criteria =	session.createCriteria(Employee.class);
	       session.detach(employeeid);
		tr.commit();
		return "Employee details deleted";	
//	}
	
	
	
	
	}
}
