package kr.co.noh.service;

import java.util.List;

import kr.co.noh.DTO.ArticleDTO;

public interface ArticleService {
	//��� ���� C
	public void ArticleWrite(ArticleDTO articleDTO);
	
	//��� ������ȸ R
	public List<ArticleDTO> ArticleListAll(int ai_id);
	
	//��� ������ȸ R
	public ArticleDTO ArticleDetail(int ai_id);
	
	//��� ���� U
	public void ArticleUpdate(int ai_id);
	
	//��� ���� D
	public void ArticleDelete(int ai_id);
}
