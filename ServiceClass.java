package com.cg.eis.service;

import java.util.HashMap;
import java.util.Map;

import com.cg.eis.bean.Employee;
import com.cg.eis.dao.DaoClass;

public class ServiceClass implements ServiceInterface {

	DaoClass dao=new DaoClass();

	@Override
	public void storeIntoMap(Employee emp) {
		int count=0;
		if(emp.getDesignation().toLowerCase().equals("manager") && emp.getSalary()>=40000) {
			emp.setInsuranceScheme("Scheme A");
			count++;
			
			
		}
		else if(emp.getDesignation().toLowerCase().equals("programmer") && emp.getSalary()>=20000 && emp.getSalary()<40000) {
			emp.setInsuranceScheme("Scheme B");
			
		}
		else if(emp.getDesignation().toLowerCase().equals("system associate") && emp.getSalary()>5000 && emp.getSalary()<20000) {
			emp.setInsuranceScheme("Scheme C");
			
		}
		else if (emp.getDesignation().toLowerCase().equals("clerk") && emp.getSalary()<5000) {
			emp.setInsuranceScheme("NO Scheme");
			
		}
		System.out.println(" "+emp.getInsuranceScheme()+"count "+count);
		dao.storeIntoMap(emp);
	}

	@Override
	public Map<Integer, Employee> displayEmployee() {
		
		return dao.displayEmployee();
	}

	@Override
	public Employee getScheme(int id) {
		Map<Integer, Employee> hm1=dao.displayEmployee();
		
			return hm1.get(id);
		
		
	
	}

}
