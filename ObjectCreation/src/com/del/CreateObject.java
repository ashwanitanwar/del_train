package com.del;

public class CreateObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dept dept= new Dept(1212, "IT", "Bangalore");
		Emp emp = new Emp(1234, "Tarun", 9999999999L, dept);
		System.out.println(emp);
		Emp e1=null;
		try {
			e1 = (Emp) emp.clone();
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dept.setLocation("Chennai");
		System.out.println(e1);
		
	}

}
