package kr.co.noh.service;

import java.util.List;

import kr.co.noh.DTO.BoardDTO;
import kr.co.noh.DTO.Criteria;

public interface BoardService {
	//�۾��� C
	public void BoardWrite(BoardDTO boardDTO) throws Exception;
	
	//�� ��ü��ȸ R
	public List<BoardDTO> boardListAll() throws Exception;
	
	//�� ����ȸ R
	public BoardDTO BoardDetail(int ai_id) throws Exception;
	
	//�� ���� U
	public void BoardUpdate(BoardDTO dto) throws Exception;
	
	//�� ���� D
	public void BoardDelete(int ai_id) throws Exception;
	
	//����¡
	public List<BoardDTO> listAll() throws Exception;
	
	//����¡
	public List<BoardDTO> listCriteria(Criteria cri) throws Exception;
	
	//����¡
	public int listCountCriteria(Criteria cri) throws Exception;
}
