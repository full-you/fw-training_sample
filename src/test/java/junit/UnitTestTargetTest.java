package test.java.junit;

// 一部import文はプラスワン用のためコメントアウト
import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.ArgumentMatchers.*;
//import static org.mockito.Mockito.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;

import main.java.junit.UnitTestTarget;

class UnitTestTargetTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1() {
		UnitTestTarget target = new UnitTestTarget();

		String result = target.testMethod("BS1-3課長");
		assertEquals("木村課長", result);
	}

	@Test
	@DisplayName("DisplayNameを使った場合")
	void test2() {
		UnitTestTarget target = new UnitTestTarget();

		String result = target.testMethod("BS1-1課長");
		assertEquals("木村課長じゃない！", result);
	}

	/*
	 *  ここからプラスワン（プラスワンのため、テストメソッドをコメントアウト
	 *  mockito実行するには以下のjarが追加で必要
	 *  byte-buddy
	 *  byte-buddy-agent
	 *  mockito-core
	 *  
	 *  実行するとコンソールにwarning出力があるが、無視でOK
	 *  気になる場合はVM引数に以下を設定すること
	 *  -XX:+EnableDynamicAgentLoading
	 */
//	@Test
//	void mockSample() {
//		
//		// SimpleCalcをMock化
//		SimpleCalc mockCalc = mock(SimpleCalc.class);
//		
//		// スタブメソッドを定義
//		// addメソッドを引数1,2の状態で実行したら1000が返却されるという定義
//		doReturn(1000).when(mockCalc).add(1, 2);
//		
//		// Mockを実行してみる
//		System.out.println(mockCalc.add(1, 2));
//		
//		// スタブメソッドを定義
//		// 引数に何が入っても実行されたら0を返却
//		doReturn(0).when(mockCalc).add(anyInt(), anyInt());
//		// Mockを実行してみる
//		System.out.println(mockCalc.add(100, 999));
//
//		// 値の返却を操作するだけじゃなくて、スタブメソッドが何回実行されたかとかも確認できちゃう
//		// 下記の場合、addメソッドが何かしらのintの値が引数に渡されて実行された回数は2回だよね！の確認
//		Mockito.verify(mockCalc, times(2)).add(anyInt(),anyInt());
//	}
//	
//	@Test
//	void mockTest1() {
//
//		// テスト対象クラスのインスタンス生成
//		UnitTestTarget target = new UnitTestTarget();
//		
//		// SimpleCalcをMock化
//		SimpleCalc mockCalc = mock(SimpleCalc.class);
//		// スタブメソッド定義
//		doReturn(1).when(mockCalc).add(1, 2);
//		
//		String result = target.plusOneMethod(mockCalc);
//
//		assertEquals("mock化成功！", result);
//	}
}
