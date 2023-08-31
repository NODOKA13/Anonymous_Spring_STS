package kr.co.noh.DAO;

import java.util.List;

import kr.co.noh.DTO.BoardDTO;

public interface BoardDAO {
	//글쓰기 C
	public void BoardWrite(BoardDTO BoardDTO);
	
	//글 전체조회 R
	public List<BoardDTO> BoardListAll();
	
	//글 상세조회 R
	public BoardDTO BoardDetail(int AI_ID);
	
	//글 수정 U
	public void BoardUpdate(int AI_ID);
	
	//글 삭제 D
	public void BoardDelete(int AI_ID);
}
