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

	//�Խñ� ���� C
	@Override
	public void BoardWrite(BoardDTO BoardDTO) {
		// TODO Auto-generated method stub
		sqlsession.insert(namespace+".BoardWrite");
	}
	
	//�Խñ� ��ü��ȸ R
	@Override
	public List<BoardDTO> BoardListAll() {
		// TODO Auto-generated method stub
		List<BoardDTO> BoardListAll = sqlsession.selectList(namespace+".BoardListAll");
		return BoardListAll;
	}
	
	//�Խñ� ������ȸ R
	@Override
	public BoardDTO BoardDetail(int AI_ID) {
		// TODO Auto-generated method stub
		BoardDTO BoardDetail = sqlsession.selectOne(namespace+".BoardDetail");
		return BoardDetail;
	}
	
	//�Խñ� ���� U
	@Override
	public void BoardUpdate(int AI_ID) {
		// TODO Auto-generated method stub
		sqlsession.update(namespace+".BoardUpdate");
	}
	
	//�Խñ� ���� D
	@Override
	public void BoardDelete(int AI_ID) {
		// TODO Auto-generated method stub
		sqlsession.delete(namespace+".BoardDelete");
	}
	
}
