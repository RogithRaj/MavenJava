package org.encap;

import java.util.LinkedList;
import java.util.List;

public class A {
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setId(123);
		e.setName("Rogith");
		e.setPhoneNo(99400517);
		
		Employee e1= new Employee();
		e1.setId(321);
		e1.setName("Raj");
		e1.setPhoneNo(1234567);
		
		Employee e2= new Employee();
		e2.setId(231);
		e2.setName("Raja");
		e2.setPhoneNo(78945612);
		
		List <Employee> li = new LinkedList<>();
		li.add(e);
		li.add(e1);
		li.add(e2);
		
		Employee a= li.get(2);
		String name = a.getName();
		System.out.println(name);
		
		System.out.println(li.get(0).getId());
		System.out.println(li.get(1).getId());
		System.out.println(li.get(2).getId());
		
		
		
		for (Employee x : li) {
			
			System.out.println(x.getId());
			System.out.println(x.getName());
			System.out.println(x.getPhoneNo());
		}
		
	
	}

}
