package com.cg.eis.dao;

import java.util.Map;

import com.cg.eis.bean.Employee;

public interface DaoInterface {
	
	void storeIntoMap(Employee employee);
	Map<Integer,Employee> displayEmployee();
//Map<Integer,Employee> getService(int id);
	
}
