package main.java.mybatis.mapper;

import java.util.List;
import java.util.Map;

import main.java.mybatis.entity.TheaterInfo;

/**
 * 劇場情報mapper
 */
public interface TheaterInfoMapper {

	/**
	 * 全件取得（TheaterInfoで返却）
	 * @return List<TheaterInfo>
	 */
	public List<TheaterInfo> selectAll();

	/**
	 * 全件取得（Mapで返却）
	 * @return List<Map<String, Object>>
	 */
	public List<Map<String, Object>> selectAllRetMap();

	/**
	 * PKをキーに検索
	 * @param theaterId
	 * @return TheaterInfo
	 */
	public TheaterInfo selectByPrimaryKey(String theaterId);

	/**
	 * insert
	 * @param theaterInfo
	 * @return 登録件数
	 */
	public int insert(TheaterInfo theaterInfo);

	/**
	 * update
	 * @param theater_nm
	 * @param theater_id
	 * @return 登録件数
	 */
	public int update(String theater_nm, String theater_id);

	/**
	 * delete
	 * @param theater_id
	 * @return 登録件数
	 */
	public int delete(String theater_id);

	/**
	 * PKをキーに検索（件数カウント）
	 * @param theater_id
	 * @returnb hit件数
	 */
	public int selectCount(String theater_id);

	/**
	 * ifタグを使ったSQLサンプル
	 * @param theater_id
	 * @param theater_nm
	 * @return List<TheaterInfo>
	 */
	public List<TheaterInfo> ifTagTest( String theater_id, String theater_nm);

	/**
	 * for-eachタグを使ったSQLサンプル
	 * @param theaterIdList
	 * @return List<TheaterInfo>
	 */
	public List<TheaterInfo> forEachTagTest(List<String> theaterIdList);

}
