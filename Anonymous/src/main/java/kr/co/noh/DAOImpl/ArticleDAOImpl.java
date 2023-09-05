package kr.co.noh.DAOImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.noh.DAO.ArticleDAO;
import kr.co.noh.DTO.ArticleDTO;

@Repository
public class ArticleDAOImpl implements ArticleDAO{
	@Autowired
	private SqlSession sqlsession;
	private final static String namespace = "kr.co.noh.mappers.ArticleMapper";
	
	//´ñ±Û ÀÛ¼º C
	@Override
	public void ArticleWrite(ArticleDTO articleDTO) {
		// TODO Auto-generated method stub
		sqlsession.insert(namespace+".ArticleWrite",articleDTO);
	}

	//´ñ±Û ÀüÁ¦Á¶È¸ R
	@Override
	public List<ArticleDTO> ArticleListAll(int ai_id) {
		// TODO Auto-generated method stub
		List<ArticleDTO> articleListAll = sqlsession.selectList(namespace+".ArticleListAll",ai_id);
		return null;
	}

	//´ñ±Û »óÁ¦Á¶È¸ R
	@Override
	public ArticleDTO ArticleDetail(int ai_id) {
		// TODO Auto-generated method stub
		ArticleDTO ArticleDetail = sqlsession.selectOne(namespace+".ArticleDetail",ai_id);
		return ArticleDetail;
	}
	
	//´ñ±Û ¼öÁ¤ U
	@Override
	public void ArticleUpdate(int ai_id) {
		// TODO Auto-generated method stub
		sqlsession.update(namespace+".ArticleUpdate",ai_id);
	}

	//´ñ±Û »èÁ¦ D
	@Override
	public void ArticleDelete(int ai_id) {
		// TODO Auto-generated method stub
		sqlsession.delete(namespace+".ArticleDelete",ai_id);
	}

}
