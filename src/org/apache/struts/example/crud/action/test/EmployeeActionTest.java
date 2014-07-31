package org.apache.struts.example.crud.action.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts.example.crud.action.EmployeeAction;
import org.apache.struts.example.crud.model.Employee;

public class EmployeeActionTest {

	@Test
	public void testSave() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		EmployeeAction action = new EmployeeAction();
		try {
			action.prepare();
			action.list();
		} catch (Exception e) {
			fail(e.toString());
		}
		
		List<Employee> employeeList = action.getEmployees();
		
		int count = employeeList.size();		
		action.setEmployee(action.getEmployees().get(0));
		
		assertTrue(ActionSupport.SUCCESS.equalsIgnoreCase(action.delete()));
		assertEquals("should -1 in employee list.", count - 1, action
				.getEmployees().size());
	}

	@Test
	public void testList() {
		EmployeeAction action = new EmployeeAction();
		try {
			action.prepare();
		} catch (Exception e) {
			fail(e.toString());
		}
		assertTrue(ActionSupport.SUCCESS.equalsIgnoreCase(action.list()));
		assertFalse("should have some items in employee list!", action
				.getEmployees().isEmpty());
	}

}
