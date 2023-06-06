package com.Bank.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	private int id;
	private String name;
	private String branch_name;
	private String profile;
	private String salary;
	private String home_town;
	private String year_of_exp;
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getHome_town() {
		return home_town;
	}
	public void setHome_town(String home_town) {
		this.home_town = home_town;
	}
	public String getYear_of_exp() {
		return year_of_exp;
	}
	public void setYear_of_exp(String year_of_exp) {
		this.year_of_exp = year_of_exp;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", branch_name=" + branch_name + ", profile=" + profile
				+ ", salary=" + salary + ", home_town=" + home_town + ", year_of_exp=" + year_of_exp + "]";
	}

}