import static org.junit.Assert.*;
import model.MemoUtil;

import org.junit.Before;
import org.junit.Test;

/**
 * Nicholas Hernandez - NHernandez6
 * CIS175 - Fall 2023
 * Sep 6, 2023
 */
public class TestMemo2 {
	String memo = "Robert";
	MemoUtil memoUtil = new MemoUtil(memo);
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void test() {
	 String memoMessage = "Hi Robert!";
	 assertEquals(memoMessage, memoUtil.greetings());
	}
}
