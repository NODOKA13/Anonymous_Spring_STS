package kr.co.noh.service;

import java.util.List;

import kr.co.noh.DTO.BoardDTO;
import kr.co.noh.DTO.Criteria;
import kr.co.noh.DTO.SearchCriteria;

public interface BoardService {
	//글쓰기 C
	public void BoardWrite(BoardDTO boardDTO) throws Exception;
	
	//글 전체조회 R
	public List<BoardDTO> boardListAll() throws Exception;
	
	//글 상세조회 R
	public BoardDTO BoardDetail(int ai_id) throws Exception;
	
	//글 수정 U
	public void BoardUpdate(BoardDTO dto) throws Exception;
	
	//글 삭제 D
	public void BoardDelete(int ai_id) throws Exception;
	
	//페이징
	public List<BoardDTO> listSearchCriteria(SearchCriteria cri) throws Exception;
	
	//페이징
	public int listSearchCount(SearchCriteria cri) throws Exception;
}
