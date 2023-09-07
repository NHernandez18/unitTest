import static org.junit.Assert.*;
import model.MemoUtil;

import org.junit.Before;
import org.junit.Test;

/**
 * Nicholas Hernandez - NHernandez6
 * CIS175 - Fall 2023
 * Sep 6, 2023
 */
public class TestMemo1 {
	String memo = "Kelli";
	MemoUtil memoUtil = new MemoUtil(memo);
	
	@Before
	public void setUp() throws Exception {
	
	}
	
	@Test
	public void test() {
	 assertEquals(memo, memoUtil.printMemo());
	}
	
	@Test
	public void testMemoLength() {
		int memoLength = memo.length();
		assertTrue(memoLength == memoUtil.returnMemoLength());
	}
	
	@Test
	public void testMemoNotNull() {
	 assertNotNull(memoUtil.printMemo( ));
	}
}
