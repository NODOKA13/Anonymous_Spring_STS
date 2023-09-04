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

	//글쓰기 C
	@Override
	public void BoardWrite(BoardDTO boardDTO) {
		// TODO Auto-generated method stub
		boarddao.BoardWrite(boardDTO);
	}

	//글 전체조회 R
	@Override
	public List<BoardDTO> boardListAll() {
		// TODO Auto-generated method stub
		return boarddao.boardListAll();
	}

	//글 상세조회 R
	@Override
	public BoardDTO BoardDetail(int ai_id) {
		// TODO Auto-generated method stub
		return boarddao.BoardDetail(ai_id);
	}

	//글 수정 U
	@Override
	public void BoardUpdate(int ai_id) {
		// TODO Auto-generated method stub
		boarddao.BoardUpdate(ai_id);
	}

	//글 삭제 D
	@Override
	public void BoardDelete(int ai_id) {
		// TODO Auto-generated method stub
		boarddao.BoardDelete(ai_id);
	}
	
}
