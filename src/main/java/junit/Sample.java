package main.java.junit;

/**
 * サンプルプログラム
 */
public class Sample {

	/**
	 * サンプルメソッド
	 * @param area　エリア
	 * @param keyWord　キーワード
	 * @param count　予約人数
	 */
	public void sampleMethod(String area, String keyWord, int count) {

		// エリア×キーワードの判定
		if ("浜松町駅".equals(area)) {

			if ("沖縄料理".equals(keyWord)) {
				// 浜松町駅×沖縄料理
			} else if ("中華料理".equals(keyWord)) {
				// 浜松町駅×中華料理
			}

		} else if ("田町駅".equals(area)) {

			if ("沖縄料理".equals(keyWord)) {
				// 田町駅×沖縄料理
			} else if ("中華料理".equals(keyWord)) {
				// 田町駅×中華料理
			}
		}

		// 予約人数のチェック
		if (count < 1) {
			System.out.println("人数が0人以下なので予約できないよ！！");
			return;
		}
	}
}
