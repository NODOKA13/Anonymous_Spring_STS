package kr.co.noh.service;

import java.util.List;

import kr.co.noh.DTO.BoardDTO;

public interface BoardService {
	//글쓰기 C
	public void BoardWrite(BoardDTO boardDTO);
	
	//글 전체조회 R
	public List<BoardDTO> boardListAll();
	
	//글 상세조회 R
	public BoardDTO BoardDetail(int ai_id);
	
	//글 수정 U
	public void BoardUpdate(BoardDTO dto);
	
	//글 삭제 D
	public void BoardDelete(int ai_id);
}
