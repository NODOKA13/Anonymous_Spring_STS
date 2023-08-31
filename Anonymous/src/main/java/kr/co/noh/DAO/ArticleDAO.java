package kr.co.noh.DAO;

import java.util.List;

import kr.co.noh.DTO.ArticleDTO;

public interface ArticleDAO {
	//��� ���� C
	public void ArticleWrite(ArticleDTO ArticleDTO);
	
	//��� ������ȸ R
	public List<ArticleDTO> ArticleListAll(int AI_Id);
	
	//��� ������ȸ R
	public ArticleDTO ArticleDetail(int AI_Id);
	
	//��� ���� U
	public void ArticleUpdate(int AI_Id);
	
	//��� ���� D
	public void ArticleDelete(int AI_Id);
}
