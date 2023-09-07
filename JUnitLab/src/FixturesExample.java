import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Nicholas Hernandez - NHernandez6
 * CIS175 - Fall 2023
 * Sep 6, 2023
 */
public class FixturesExample {
	protected int value1, value2;
	
	@Before
	public void setUp() throws Exception {
	 value1 = 3;
	 value2 = 3;
	}
	
	@Test
	public void test() {
		double result = value1 + value2;
	   assertTrue(result == 6);
	}
}