package com.cg.eis.service;

import java.util.Map;

import com.cg.eis.bean.Employee;

public interface ServiceInterface {
	
	
	void storeIntoMap(Employee emp);
	Map<Integer,Employee> displayEmployee();
	Employee getScheme(int id);
}
