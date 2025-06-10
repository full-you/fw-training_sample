package main.java.standard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Java標準の機能でDB接続してみるクラス
 */
public class StandardConnect {

	//DB接続用定数
	private static final String DATABASE_NAME = "training";
	private static final String URL = "jdbc:mySQL://localhost/" + DATABASE_NAME;
	//DB接続用・ユーザ定数
	private static final String USER = "root";
	private static final String PASS = "root";

	/**
	 * メインメソッド
	 * @param args
	 */
	public static void main(String[] args) {

		// finallyでcloseしたいためtry外でコネクションを宣言
		Connection conn = null;

		try {
			//データベースに接続
			conn = DriverManager.getConnection(URL, USER, PASS);

			System.out.println("データベースに接続に成功");

			// ステートメント作成
			Statement stmt = conn.createStatement();
			// SQL実行
			ResultSet rs = stmt.executeQuery("select * from THEATER_INFO");

			// 実行結果確認
			while (rs.next()) {
				String theaterId = rs.getString("theater_id");
				String theaterNm = rs.getString("theater_nm");
				String prefecturesCd = rs.getString("prefectures_cd");

				System.out.println("theater_id:" + theaterId + ", theater_nm:" + theaterNm + ", prefectures_cd:" + prefecturesCd);
			}

			// クローズ
			rs.close();
			stmt.close();

		} catch (SQLException  e) {
			// スタックトレース出力
			e.printStackTrace();
		} finally {
			// コネクションをクローズ
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}
}
