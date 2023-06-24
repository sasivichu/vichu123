package org.test;

public class Company extends Sample {
	public void comName() {
System.out.println("Company Name is Sasi & Co");
	}
	public void companyid() {
System.out.println("Company Id is 789655");

	}
	public static void main(String[] args) {
		Company c = new Company();
		c.comName();
		c.companyid();
		c.empID();
		c.empName();
		
		}
	
	

}
