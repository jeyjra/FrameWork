package org.cts.test.login;

public class Sbibank extends ICICI {
	
	public void saving() {
		System.out.println("8%");
	}
	public void deposit() {
	System.out.println("7%");	
		
	}
		
	
  public void fixed() {
	  System.out.println("4%");
  }
  public static void main(String[] args) {
	Sbibank s=new Sbibank();
	s.fixed();
	s.saving();
	s.deposit();
	s.withdraw();
	
}
  
}
