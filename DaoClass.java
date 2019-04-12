package com.cg.eis.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.eis.bean.Employee;

public class DaoClass implements DaoInterface {
	Map<Integer,Employee> emps=new HashMap<Integer,Employee>();

	@Override
	public void storeIntoMap(Employee employee) {
		emps.put(employee.getId(), employee);
		
	}

	@Override
	public Map<Integer, Employee> displayEmployee() {
		return emps;
	}
	public Map<Integer, Employee> displayEmp() {
		return emps;
	}

	

}
