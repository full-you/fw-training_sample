package main.java.mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import main.java.mybatis.entity.TheaterInfo;
import main.java.mybatis.mapper.TheaterInfoMapper;

public class MyBatisConnect {

	public static void main(String[] args) {

		String resource = "main/resources/mybatis-config.xml";

		// エラー回避でとりあえずnullで初期化
		InputStream inputStream = null;

		try {
			// configの読み込み
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// セッションファクトリーの生成
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		// セッションファクトリーからSQLセッションを取得
		SqlSession session = sqlSessionFactory.openSession();

		// SQLセッションからMapperを取得
		TheaterInfoMapper mapper = session.getMapper(TheaterInfoMapper.class);

		// selet文実行
		List<TheaterInfo> theaterInfoList = mapper.selectAll();

		// 取得結果の表示
		System.out.println("★取得結果確認★");
		for (TheaterInfo theaterInfo : theaterInfoList) {
			String theaterId = theaterInfo.getTheater_id();
			String theaterNm = theaterInfo.getTheater_nm();
			String prefecturesCd = theaterInfo.getPrefectures_cd();

			System.out.println(
					"theater_id:" + theaterId + ", theater_nm:" + theaterNm + ", prefectures_cd:" + prefecturesCd);
		}

		// ここからプラスワン
//		// Mapで返却
//		List<Map<String, Object>> listMap = mapper.selectAllRetMap();
//		String theaterId = listMap.get(0).get("theater_id").toString();
//		String theaterNm = listMap.get(0).get("theater_nm").toString();
//		String prefecturesCd = listMap.get(0).get("prefectures_cd").toString();
//
//		System.out.println("★取得結果確認★");
//		System.out.println(
//				"theater_id:" + theaterId + ", theater_nm:" + theaterNm + ", prefectures_cd:" + prefecturesCd);
//
//		// ここからinsert,update,delete
//		System.out.println("★★★★insert,update,delete★★★★");
//		// insertしてみる
//		TheaterInfo insertData = new TheaterInfo();
//		insertData.setTheater_id("T999");
//		insertData.setTheater_nm("テスト劇場");
//		insertData.setPrefectures_cd("10");
//
//		int insertCnt = mapper.insert(insertData);
//		if (insertCnt > 0) {
//			session.commit();
//			TheaterInfo result = mapper.selectByPrimaryKey("T999");
//			String insTheaterId = result.getTheater_id();
//			String insTheaterNm = result.getTheater_nm();
//			String insPrefecturesCd = result.getPrefectures_cd();
//
//			System.out.println("★insert結果確認★");
//			System.out.println(
//					"theater_id:" + insTheaterId + ", theater_nm:" + insTheaterNm + ", prefectures_cd:" + insPrefecturesCd);
//		} else {
//			System.out.println("insert失敗");
//		}
//
//		// updateしてみる
//		int updateCnt = mapper.update("修正", "T999");
//
//		if (updateCnt > 0) {
//			session.commit();
//			TheaterInfo result = mapper.selectByPrimaryKey("T999");
//			String updTheaterId = result.getTheater_id();
//			String updTheaterNm = result.getTheater_nm();
//			String updPrefecturesCd = result.getPrefectures_cd();
//
//			System.out.println("★update結果確認★");
//			System.out.println(
//					"theater_id:" + updTheaterId + ", theater_nm:" + updTheaterNm + ", prefectures_cd:" + updPrefecturesCd);
//		} else {
//			System.out.println("update失敗");
//		}
//
//		// deleteしてみる
//		int deleteCnt = mapper.delete("T999");
//
//		if (deleteCnt > 0) {
//			session.commit();
//
//			System.out.println("★delete結果確認★");
//			System.out.println("レコード件数：" + mapper.selectCount("T999"));
//		} else {
//			System.out.println("delete失敗");
//		}
	}
}
