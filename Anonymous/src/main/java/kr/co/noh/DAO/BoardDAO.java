package kr.co.noh.DAO;

import java.util.List;

import kr.co.noh.DTO.BoardDTO;
import kr.co.noh.DTO.Criteria;

public interface BoardDAO {
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
	public List<BoardDTO> listAll()throws Exception;
	
	//����¡
	public List<BoardDTO> listPage(int page) throws Exception;
	
	//����¡
	public List<BoardDTO> listCriteria(Criteria cri) throws Exception;
	
	//����¡
	public int countPaging(Criteria cri) throws Exception;
}
