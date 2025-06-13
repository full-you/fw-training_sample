package main.java.mybatis.entity;

import java.io.Serializable;

/**
 * THEATER_INFOテーブルのEntity
 */
public class TheaterInfo implements Serializable {

	// 劇場ID
	private String theater_id;
	// 劇場名
	private String theater_nm;
	// 都道府県コード
	private String prefectures_cd;

	/**
	 * 劇場IDを取得します
	 * @return theater_id
	 */
	public String getTheater_id() {
		return theater_id;
	}

	/**
	 * 劇場IDを設定します
	 * @param theater_id
	 */
	public void setTheater_id(String theater_id) {
		this.theater_id = theater_id;
	}

	/**
	 * 劇場名を取得します
	 * @return 劇場名
	 */
	public String getTheater_nm() {
		return theater_nm;
	}

	/**
	 * 劇場名を設定します
	 * @param theater_nm
	 */
	public void setTheater_nm(String theater_nm) {
		this.theater_nm = theater_nm;
	}

	/**
	 * 都道府県コードを取得します
	 * @return 都道府県コード
	 */
	public String getPrefectures_cd() {
		return prefectures_cd;
	}

	/**
	 * 都道府県コードを設定します
	 * @param prefectures_cd
	 */
	public void setPrefectures_cd(String prefectures_cd) {
		this.prefectures_cd = prefectures_cd;
	}
}