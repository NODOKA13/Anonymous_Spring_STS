package kr.co.noh.serviceImpl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.noh.DAO.ArticleDAO;
import kr.co.noh.DTO.ArticleDTO;
import kr.co.noh.service.ArticleService;

@Service //p187 ���� ����� ����� �ʱ�
public class ArticleServiceImpl implements ArticleService{

	@Inject
	private ArticleDAO articledao;
	
	//��� ���� C
	@Override
	public void ArticleWrite(ArticleDTO articleDTO) {
		// TODO Auto-generated method stub
		articledao.ArticleWrite(articleDTO);
	}
	
	//��� ������ȸ R
	@Override
	public List<ArticleDTO> ArticleListAll(int ai_id) {
		// TODO Auto-generated method stub
		return articledao.ArticleListAll(ai_id);
	}

	//��� ������ȸ R
	@Override
	public ArticleDTO ArticleDetail(int ai_id) {
		// TODO Auto-generated method stub
		return articledao.ArticleDetail(ai_id);
	}

	//��� ���� U
	@Override
	public void ArticleUpdate(int ai_id) {
		// TODO Auto-generated method stub
		articledao.ArticleUpdate(ai_id);
	}

	//��� ���� D
	@Override
	public void ArticleDelete(int ai_id) {
		// TODO Auto-generated method stub
		articledao.ArticleDelete(ai_id);
	}

}
