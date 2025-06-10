package main.java.junit;

/**
 * すごく適当なクラス
 */
public class UnitTestTarget {

	/**
	 * すごく適当なメソッド
	 * @param arg
	 * @return message
	 */
	public String testMethod(String arg) {
		String message;

		if ("BS1-3課長".equals(arg)) {
			message = "木村課長";
		} else {
			message = "木村課長じゃない！";
		}
		return message;
	}

	// ここからプラスワン
	/**
	 * Mockを使ってみよう！
	 * @param calc
	 * @return result
	 */
	public String plusOneMethod(SimpleCalc calc) {
		
		String result;
		
		int a = 1;
		int b = 2;
		int add = calc.add(a, b);
		
		if(add == 3) {
			result = "mock化失敗！";
		}else {
			result = "mock化成功！";
		}
		
		return result;
	}
}
