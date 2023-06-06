package com.Bank.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Bank.Dao.EmpDao;
import com.Bank.Entity.Employee;

@Service
public class EmpService {

	@Autowired
	private EmpDao dao;

	public List<Employee> getAllDetails() {

		return dao.getAllDetails();
	}

	public Employee get() {

		return dao.get();
	}

	public String insertDetails(Employee employee) {

		return dao.insertDetails(employee);

	}

	public List<Employee> getEmpSalGret40k() {

		return dao.getEmpSalGret40k();
	}

	public String insertDetailss(List<Employee> employee) {
		return dao.insertDetailss(employee);
	}

	

	public String deleteEmployeeDetails(int employeeid) {
		return dao.deleteEmployeeDetails( employeeid);
	}
}
