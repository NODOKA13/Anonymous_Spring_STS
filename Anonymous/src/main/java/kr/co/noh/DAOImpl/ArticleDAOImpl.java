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
	private final static String namespace = "kr.co.noh.ArticleMapper";
	
	//��� �ۼ� C
	@Override
	public void ArticleWrite(ArticleDTO ArticleDTO) {
		// TODO Auto-generated method stub
		sqlsession.insert(namespace+".ArticleWrite");
	}

	//��� ������ȸ R
	@Override
	public List<ArticleDTO> ArticleListAll(int AI_Id) {
		// TODO Auto-generated method stub
		List<ArticleDTO> ArticleListAll = sqlsession.selectList(namespace+".ArticleListAll");
		return null;
	}

	//��� ������ȸ R
	@Override
	public ArticleDTO ArticleDetail(int AI_Id) {
		// TODO Auto-generated method stub
		ArticleDTO ArticleDetail = sqlsession.selectOne(namespace+".ArticleDetail");
		return ArticleDetail;
	}
	
	//��� ���� U
	@Override
	public void ArticleUpdate(int AI_Id) {
		// TODO Auto-generated method stub
		sqlsession.update(namespace+".ArticleUpdate");
	}

	//��� ���� D
	@Override
	public void ArticleDelete(int AI_Id) {
		// TODO Auto-generated method stub
		sqlsession.delete(namespace+".ArticleDelete");
	}

}
