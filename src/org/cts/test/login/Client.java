package org.cts.test.login;

public class Client {
	public void empDetails(String name) {
		System.out.println("String method"+name);
	}
		
	public void empDetails(String name1,int id,long phoneno) {
		System.out.println("count method"+name1+"\n"+id);
	    System.out.println(phoneno);
	}
	public void empDetails(float empSalary) {
		System.out.println("float method"+empSalary);
	}
	public void empDetails(String city,int pincode)	{
		System.out.println("order method"+city+"\t"+pincode);
	}
	public void empDetails(int pincode,String city) {
		System.out.println("order method "+pincode+"\t"+city);
	}
	public static void main(String[] args) {
		Client c=new Client();
		c.empDetails("raj");
		c.empDetails("jey", 1223, 9750566560l);
		c.empDetails(698.12344623566f);
		c.empDetails("chennai", 626111);
		c.empDetails(626111, "rjpm");
		
	
	}
}


		
	
	
	
		
	
	    
	
	
	


