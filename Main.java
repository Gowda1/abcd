package com.cg.eis.pl;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.ServiceClass;
import com.cg.eis.service.ServiceInterface;

public class Main {

	public static void main(String[] args) {
		ServiceInterface sc=new ServiceClass();
		
		Scanner scn=new Scanner(System.in);
		Scanner scn1=new Scanner(System.in);
		int id,opt;
		String name;
		int salary,empcount;
		String designation;
		String insuranceScheme;
		do {
		System.out.println("Choose Option:");
		System.out.println("1.Add Employee details:");
		System.out.println("2.Insurance scheme of employee:");
		System.out.println("3.Details of all employee:");
		opt=scn.nextInt();
		switch(opt) {
				case 1:
							System.out.println("emppolyee object size:");
							empcount=scn.nextInt();
							Employee[] e=new Employee[empcount];
							
							for(int i=0;i<empcount;i++) {
							e[i]=new Employee();
							System.out.println("Enter Employee Id:");
							id=scn.nextInt();
							e[i].setId(id); 
							
							System.out.println("Enter name of Employee:");
							name=scn1.nextLine();
							e[i].setName(name);
							
							System.out.println("Enter Salary of Employee:");
							salary=scn.nextInt();
							e[i].setSalary(salary);
							
							System.out.println("Enter designation of employee:");
							designation=scn1.nextLine();
							e[i].setDesignation(designation);
							
							
							sc.storeIntoMap(e[i]);
							System.out.println("First Employee successfully added");
							}
							break;
					
				case 2:
							System.out.println("Enter Employee Id to find the employee insurance scheme");
							id=scn.nextInt();
							Employee emps1=sc.getScheme(id);
							System.out.println("Name of employee: "+emps1.getName());
							System.out.println("Employee insurance scheme is: "+emps1.getInsuranceScheme());
						
						break;
				case 3:
							Map<Integer,Employee> emps=sc.displayEmployee();
							System.out.println(" "+emps);
						
		
			}
		}while(true);
		
		
		
		
	}
	
}
