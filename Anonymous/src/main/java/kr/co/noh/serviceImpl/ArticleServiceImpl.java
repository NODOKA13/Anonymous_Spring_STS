package kr.co.noh.serviceImpl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.noh.DAO.ArticleDAO;
import kr.co.noh.DTO.ArticleDTO;
import kr.co.noh.service.ArticleService;

@Service //p187 서비스 등록을 까먹지 않기
public class ArticleServiceImpl implements ArticleService{

	@Inject
	private ArticleDAO articledao;
	
	//댓글 쓰기 C
	@Override
	public void ArticleWrite(ArticleDTO articleDTO) {
		// TODO Auto-generated method stub
		articledao.ArticleWrite(articleDTO);
	}
	
	//댓글 전제조회 R
	@Override
	public List<ArticleDTO> ArticleListAll(int ai_id) {
		// TODO Auto-generated method stub
		return articledao.ArticleListAll(ai_id);
	}

	//댓글 상제조회 R
	@Override
	public ArticleDTO ArticleDetail(int ai_id) {
		// TODO Auto-generated method stub
		return articledao.ArticleDetail(ai_id);
	}

	//댓글 수정 U
	@Override
	public void ArticleUpdate(int ai_id) {
		// TODO Auto-generated method stub
		articledao.ArticleUpdate(ai_id);
	}

	//댓글 삭제 D
	@Override
	public void ArticleDelete(int ai_id) {
		// TODO Auto-generated method stub
		articledao.ArticleDelete(ai_id);
	}

}
