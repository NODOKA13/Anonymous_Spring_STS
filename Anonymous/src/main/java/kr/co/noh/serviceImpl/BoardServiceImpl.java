package kr.co.noh.serviceImpl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.noh.DAO.BoardDAO;
import kr.co.noh.DTO.BoardDTO;
import kr.co.noh.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Inject
	private BoardDAO boarddao;

	//�۾��� C
	@Override
	public void BoardWrite(BoardDTO boardDTO) {
		// TODO Auto-generated method stub
		boarddao.BoardWrite(boardDTO);
	}

	//�� ��ü��ȸ R
	@Override
	public List<BoardDTO> boardListAll() {
		// TODO Auto-generated method stub
		return boarddao.boardListAll();
	}

	//�� ����ȸ R
	@Override
	public BoardDTO BoardDetail(int ai_id) {
		// TODO Auto-generated method stub
		return boarddao.BoardDetail(ai_id);
	}

	//�� ���� U
	@Override
	public void BoardUpdate(int ai_id) {
		// TODO Auto-generated method stub
		boarddao.BoardUpdate(ai_id);
	}

	//�� ���� D
	@Override
	public void BoardDelete(int ai_id) {
		// TODO Auto-generated method stub
		boarddao.BoardDelete(ai_id);
	}
	
}
