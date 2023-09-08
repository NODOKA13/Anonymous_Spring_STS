package kr.co.noh.DAO;

import java.util.List;

import kr.co.noh.DTO.ArticleDTO;

public interface ArticleDAO {
	//��� ���� C
	public void ArticleWrite(ArticleDTO articleDTO) throws Exception;
	
	//��� ������ȸ R
	public List<ArticleDTO> ArticleListAll(int ai_id) throws Exception;
	
	//��� ������ȸ R
	public ArticleDTO ArticleDetail(int ai_id) throws Exception;
	
	//��� ���� U
	public void ArticleUpdate(int ai_id) throws Exception;
	
	//��� ���� D
	public void ArticleDelete(int ai_id) throws Exception;
}
