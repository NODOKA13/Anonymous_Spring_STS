package kr.co.noh.DAO;

import java.util.List;

import kr.co.noh.DTO.BoardDTO;

public interface BoardDAO {
	//�۾��� C
	public void BoardWrite(BoardDTO boardDTO);
	
	//�� ��ü��ȸ R
	public List<BoardDTO> boardListAll();
	
	//�� ����ȸ R
	public BoardDTO BoardDetail(int ai_id);
	
	//�� ���� U
	public void BoardUpdate(int ai_id);
	
	//�� ���� D
	public void BoardDelete(int ai_id);
}
