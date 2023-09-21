package kr.co.noh.DAOImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.cj.Session;

import kr.co.noh.DAO.BoardDAO;
import kr.co.noh.DTO.BoardDTO;
import kr.co.noh.DTO.Criteria;
import kr.co.noh.DTO.SearchCriteria;

@Repository
public class BoardDAOImpl implements BoardDAO {
	@Autowired
	private SqlSession sqlsession;
	private final static String namespace = "kr.co.noh.mappers.BoardMapper";

	// �Խñ� ���� C
	@Override
	public void BoardWrite(BoardDTO boarddto) throws Exception {
		// TODO Auto-generated method stub
		sqlsession.insert(namespace + ".BoardWrite", boarddto);
	}

	// �Խñ� ��ü��ȸ R
	@Override
	public List<BoardDTO> boardListAll() throws Exception {
		// TODO Auto-generated method stub
		List<BoardDTO> boardListAll = sqlsession.selectList(namespace + ".BoardListAll");
		return boardListAll;
	}

	// �Խñ� ������ȸ R
	@Override
	public BoardDTO BoardDetail(int ai_id) throws Exception {
		// TODO Auto-generated method stub
		BoardDTO BoardDetail = sqlsession.selectOne(namespace + ".BoardDetail", ai_id);
		return BoardDetail;
	}

	// �Խñ� ���� U
	@Override
	public void BoardUpdate(BoardDTO dto) throws Exception {
		// TODO Auto-generated method stub
		sqlsession.update(namespace + ".BoardUpdate", dto);
	}

	// �Խñ� ���� D
	@Override
	public void BoardDelete(int ai_id) throws Exception {
		// TODO Auto-generated method stub
		sqlsession.delete(namespace + ".BoardDelete", ai_id);
	}

	// ����¡
	@Override
	public List<BoardDTO> listPage(int page) throws Exception {
		// TODO Auto-generated method stub
		if (page <= 0) {
			page = 1;
		}

		page = (page - 1) * 10;

		return sqlsession.selectList(namespace + ".listPage", page);
	}

	// ����¡
	@Override
	public List<BoardDTO> listCriteria(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return sqlsession.selectList(namespace + ".listCriteria", cri);
	}

	// ����¡
	@Override
	public int countPaging(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return sqlsession.selectOne(namespace + ".countPaging", cri);
	}

	@Override
	public List<BoardDTO> listSearch(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return sqlsession.selectList(namespace+".listSearch", cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return sqlsession.selectOne(namespace+".listSearchCount",cri);
	}

}
