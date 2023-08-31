package kr.co.noh.DAO;

import java.util.List;

import kr.co.noh.DTO.BoardDTO;

public interface BoardDAO {
	//�۾��� C
	public void BoardWrite(BoardDTO BoardDTO);
	
	//�� ��ü��ȸ R
	public List<BoardDTO> BoardListAll();
	
	//�� ����ȸ R
	public BoardDTO BoardDetail(int AI_ID);
	
	//�� ���� U
	public void BoardUpdate(int AI_ID);
	
	//�� ���� D
	public void BoardDelete(int AI_ID);
}
