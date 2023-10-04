package kr.co.noh.DAO;

import java.util.List;

import kr.co.noh.DTO.ArticleDTO;
import kr.co.noh.DTO.Criteria;

public interface ArticleDAO {
	//¥Ò±€ æ≤±‚ C
	public void ArticleWrite(ArticleDTO articleDTO) throws Exception;
	
	//¥Ò±€ ¿¸¡¶¡∂»∏ R
	public List<ArticleDTO> ArticleListAll(int board_ai_id) throws Exception;
	
	//¥Ò±€ ªÛ¡¶¡∂»∏ R
	public ArticleDTO ArticleDetail(int ai_id) throws Exception;
	
	//¥Ò±€ ºˆ¡§ U
	public void ArticleUpdate(ArticleDTO articleDTO) throws Exception;
	
	//¥Ò±€ ªË¡¶ D
	public void ArticleDelete(int ai_id) throws Exception;
	
	//¥Ò±€ ∆‰¿Ã¬°
	public List<ArticleDTO> listPage(int ai_id, Criteria cri) throws Exception;
	
	//µ´±€ ∆‰¿Ã¬°
	public int count(int ai_id) throws Exception;
}
