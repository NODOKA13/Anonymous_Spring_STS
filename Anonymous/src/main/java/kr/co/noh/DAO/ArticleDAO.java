package kr.co.noh.DAO;

import java.util.List;

import kr.co.noh.DTO.ArticleDTO;

public interface ArticleDAO {
	//´ñ±Û ¾²±â C
	public void ArticleWrite(ArticleDTO articleDTO) throws Exception;
	
	//´ñ±Û ÀüÁ¦Á¶È¸ R
	public List<ArticleDTO> ArticleListAll(int ai_id) throws Exception;
	
	//´ñ±Û »óÁ¦Á¶È¸ R
	public ArticleDTO ArticleDetail(int ai_id) throws Exception;
	
	//´ñ±Û ¼öÁ¤ U
	public void ArticleUpdate(int ai_id) throws Exception;
	
	//´ñ±Û »èÁ¦ D
	public void ArticleDelete(int ai_id) throws Exception;
}
