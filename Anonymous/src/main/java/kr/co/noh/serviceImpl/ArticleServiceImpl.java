package kr.co.noh.serviceImpl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.noh.DAO.ArticleDAO;
import kr.co.noh.DTO.ArticleDTO;
import kr.co.noh.DTO.Criteria;
import kr.co.noh.service.ArticleService;

@Service //p187 ���� ����� ����� �ʱ�
public class ArticleServiceImpl implements ArticleService{

	@Inject
	private ArticleDAO articledao;
	
	//��� ���� C
	@Override
	public void ArticleWrite(ArticleDTO articleDTO) throws Exception{
		// TODO Auto-generated method stub
		articledao.ArticleWrite(articleDTO);
	}
	
	//��� ������ȸ R
	@Override
	public List<ArticleDTO> ArticleListAll(int board_ai_id) throws Exception{
		// TODO Auto-generated method stub
		return articledao.ArticleListAll(board_ai_id);
	}

	//��� ������ȸ R
	@Override
	public ArticleDTO ArticleDetail(int ai_id) throws Exception{
		// TODO Auto-generated method stub
		return articledao.ArticleDetail(ai_id);
	}

	//��� ���� U
	@Override
	public void ArticleUpdate(ArticleDTO articleDTO) throws Exception{
		// TODO Auto-generated method stub
		articledao.ArticleUpdate(articleDTO);
	}

	//��� ���� D
	@Override
	public void ArticleDelete(int ai_id) throws Exception{
		// TODO Auto-generated method stub
		articledao.ArticleDelete(ai_id);
	}

	@Override
	public List<ArticleDTO> listartilePage(int ai_id, Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return articledao.listPage(ai_id, cri);
	}

	@Override
	public int count(int ai_id) throws Exception {
		// TODO Auto-generated method stub
		return articledao.count(ai_id);
	}

}
