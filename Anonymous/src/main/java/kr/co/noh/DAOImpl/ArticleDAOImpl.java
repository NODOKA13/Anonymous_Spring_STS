package kr.co.noh.DAOImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.noh.DAO.ArticleDAO;
import kr.co.noh.DTO.ArticleDTO;
import kr.co.noh.DTO.Criteria;

@Repository
public class ArticleDAOImpl implements ArticleDAO{
	@Autowired
	private SqlSession sqlsession;
	private final static String namespace = "kr.co.noh.mappers.ArticleMapper";
	
	//´ñ±Û ÀÛ¼º C
	@Override
	public void ArticleWrite(ArticleDTO articleDTO) throws Exception{
		// TODO Auto-generated method stub
		sqlsession.insert(namespace+".ArticleWrite",articleDTO);
	}

	//´ñ±Û ÀüÁ¦Á¶È¸ R
	@Override
	public List<ArticleDTO> ArticleListAll(int board_ai_id) throws Exception{
		// TODO Auto-generated method stub
		List<ArticleDTO> articleListAll = sqlsession.selectList(namespace+".ArticleListAll",board_ai_id);
		return articleListAll;
	}

	//´ñ±Û »óÁ¦Á¶È¸ R
	@Override
	public ArticleDTO ArticleDetail(int ai_id) throws Exception{
		// TODO Auto-generated method stub
		ArticleDTO ArticleDetail = sqlsession.selectOne(namespace+".ArticleDetail",ai_id);
		return ArticleDetail;
	}
	
	//´ñ±Û ¼öÁ¤ U
	@Override
	public void ArticleUpdate(ArticleDTO articleDTO) throws Exception{
		// TODO Auto-generated method stub
		sqlsession.update(namespace+".ArticleUpdate", articleDTO);
	}

	//´ñ±Û »èÁ¦ D
	@Override
	public void ArticleDelete(int ai_id) throws Exception{
		// TODO Auto-generated method stub
		sqlsession.delete(namespace+".ArticleDelete",ai_id);
	}

	@Override
	public List<ArticleDTO> listPage(int ai_id, Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<>();
		
		paramMap.put("ai_id", ai_id);
		paramMap.put("cri", cri);
		
		return sqlsession.selectList(namespace+".listPage",paramMap);
	}

	@Override
	public int count(int ai_id) throws Exception {
		// TODO Auto-generated method stub
		return sqlsession.selectOne(namespace+".count",ai_id);
	}

}
