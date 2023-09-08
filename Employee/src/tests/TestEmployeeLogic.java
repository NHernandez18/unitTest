package tests;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import model.Employee;

/**
 * Nicholas Hernandez - NHernandez6
 * CIS175 - Fall 2023
 * Sep 6, 2023
 */
public class TestEmployeeLogic {
	EmpBusinessLogic empBL = new EmpBusinessLogic();
	Employee employee = new Employee("Emily");
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testCalculateAppraisal() {
		employee.setMonthlySalary(8000);
		double appraisal = empBL.calculateAppraisal(employee);
		assertEquals(500, appraisal, 0.0);
	}
	
	@Test
	public void testCalculateYearlySalary() {
		employee.setMonthlySalary(8000);
		double salary = empBL.calculateYearlySalary(employee);
		assertEquals(96000, salary, 0.0);
	}
	
	@Test
	public void testEmployeeIsRetirementAge() {
		employee.setAge(70);
		assertTrue(empBL.isRetirementAge(employee));
	}
	
	@Test
	public void testEmployeeIsNotRetirementAge() {
		employee.setAge(25);
		assertFalse(empBL.isRetirementAge(employee));
	}
	
}
