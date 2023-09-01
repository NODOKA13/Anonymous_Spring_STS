package kr.co.noh.DAOImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.noh.DAO.BoardDAO;
import kr.co.noh.DTO.BoardDTO;

@Repository
public class BoardDAOImpl implements BoardDAO{
	@Autowired
	private SqlSession sqlsession;
	private final static String namespace = "kr.co.noh.BoardMapper";

	//게시글 쓰기 C
	@Override
	public void BoardWrite(BoardDTO boarddto) {
		// TODO Auto-generated method stub
		sqlsession.insert(namespace+".BoardWrite");
	}
	
	//게시글 전체조회 R
	@Override
	public List<BoardDTO> boardListAll() {
		// TODO Auto-generated method stub
		List<BoardDTO> boardListAll = sqlsession.selectList(namespace+".BoardListAll");
		return boardListAll;
	}
	
	//게시글 상제조회 R
	@Override
	public BoardDTO BoardDetail(int ai_id) {
		// TODO Auto-generated method stub
		BoardDTO BoardDetail = sqlsession.selectOne(namespace+".BoardDetail");
		return BoardDetail;
	}
	
	//게시글 수정 U
	@Override
	public void BoardUpdate(int ai_id) {
		// TODO Auto-generated method stub
		sqlsession.update(namespace+".BoardUpdate");
	}
	
	//게시글 삭제 D
	@Override
	public void BoardDelete(int ai_id) {
		// TODO Auto-generated method stub
		sqlsession.delete(namespace+".BoardDelete");
	}
	
}
