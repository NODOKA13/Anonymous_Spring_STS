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

	// 게시글 쓰기 C
	@Override
	public void BoardWrite(BoardDTO boarddto) throws Exception {
		// TODO Auto-generated method stub
		sqlsession.insert(namespace + ".BoardWrite", boarddto);
	}

	// 게시글 전체조회 R
	@Override
	public List<BoardDTO> boardListAll() throws Exception {
		// TODO Auto-generated method stub
		List<BoardDTO> boardListAll = sqlsession.selectList(namespace + ".BoardListAll");
		return boardListAll;
	}

	// 게시글 상제조회 R
	@Override
	public BoardDTO BoardDetail(int ai_id) throws Exception {
		// TODO Auto-generated method stub
		BoardDTO BoardDetail = sqlsession.selectOne(namespace + ".BoardDetail", ai_id);
		return BoardDetail;
	}

	// 게시글 수정 U
	@Override
	public void BoardUpdate(BoardDTO dto) throws Exception {
		// TODO Auto-generated method stub
		sqlsession.update(namespace + ".BoardUpdate", dto);
	}

	// 게시글 삭제 D
	@Override
	public void BoardDelete(int ai_id) throws Exception {
		// TODO Auto-generated method stub
		sqlsession.delete(namespace + ".BoardDelete", ai_id);
	}

	// 페이징
	@Override
	public List<BoardDTO> listPage(int page) throws Exception {
		// TODO Auto-generated method stub
		if (page <= 0) {
			page = 1;
		}

		page = (page - 1) * 10;

		return sqlsession.selectList(namespace + ".listPage", page);
	}

	// 페이징
	@Override
	public List<BoardDTO> listCriteria(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return sqlsession.selectList(namespace + ".listCriteria", cri);
	}

	// 페이징
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
