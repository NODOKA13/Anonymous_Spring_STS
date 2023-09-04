package kr.co.noh.service;

import java.util.List;

import kr.co.noh.DTO.ArticleDTO;

public interface ArticleService {
	//´ñ±Û ¾²±â C
	public void ArticleWrite(ArticleDTO articleDTO);
	
	//´ñ±Û ÀüÁ¦Á¶È¸ R
	public List<ArticleDTO> ArticleListAll(int ai_id);
	
	//´ñ±Û »óÁ¦Á¶È¸ R
	public ArticleDTO ArticleDetail(int ai_id);
	
	//´ñ±Û ¼öÁ¤ U
	public void ArticleUpdate(int ai_id);
	
	//´ñ±Û »èÁ¦ D
	public void ArticleDelete(int ai_id);
}
