package model;

/**
 * Nicholas Hernandez - NHernandez6
 * CIS175 - Fall 2023
 * Sep 6, 2023
 */
public class MemoUtil {
	private String memo;
	
	public MemoUtil(String memo) {
		this.memo = memo;
	}
	
	// prints the memo
	public String printMemo() {
		return memo;
	}
	
	public String greetings() {
		return "Hi " + memo + "!";
		}
	
	public int returnMemoLength() {
		return memo.length();
	} 

}
