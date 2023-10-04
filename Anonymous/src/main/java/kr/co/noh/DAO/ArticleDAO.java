package kr.co.noh.DAO;

import java.util.List;

import kr.co.noh.DTO.ArticleDTO;
import kr.co.noh.DTO.Criteria;

public interface ArticleDAO {
	//��� ���� C
	public void ArticleWrite(ArticleDTO articleDTO) throws Exception;
	
	//��� ������ȸ R
	public List<ArticleDTO> ArticleListAll(int board_ai_id) throws Exception;
	
	//��� ������ȸ R
	public ArticleDTO ArticleDetail(int ai_id) throws Exception;
	
	//��� ���� U
	public void ArticleUpdate(ArticleDTO articleDTO) throws Exception;
	
	//��� ���� D
	public void ArticleDelete(int ai_id) throws Exception;
	
	//��� ����¡
	public List<ArticleDTO> listPage(int ai_id, Criteria cri) throws Exception;
	
	//���� ����¡
	public int count(int ai_id) throws Exception;
}
