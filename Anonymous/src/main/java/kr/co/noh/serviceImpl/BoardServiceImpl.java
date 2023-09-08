package kr.co.noh.serviceImpl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.noh.DAO.BoardDAO;
import kr.co.noh.DTO.BoardDTO;
import kr.co.noh.DTO.Criteria;
import kr.co.noh.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Inject
	private BoardDAO boarddao;

	//�۾��� C
	@Override
	public void BoardWrite(BoardDTO boardDTO) throws Exception{
		// TODO Auto-generated method stub
		boarddao.BoardWrite(boardDTO);
	}

	//�� ��ü��ȸ R
	@Override
	public List<BoardDTO> boardListAll() throws Exception{
		// TODO Auto-generated method stub
		return boarddao.boardListAll();
	}

	//�� ����ȸ R
	@Override
	public BoardDTO BoardDetail(int ai_id) throws Exception{
		// TODO Auto-generated method stub
		return boarddao.BoardDetail(ai_id);
	}

	//�� ���� U
	@Override
	public void BoardUpdate(BoardDTO dto) throws Exception{
		// TODO Auto-generated method stub
		boarddao.BoardUpdate(dto);
	}

	//�� ���� D
	@Override
	public void BoardDelete(int ai_id) throws Exception{
		// TODO Auto-generated method stub
		boarddao.BoardDelete(ai_id);
	}
	
	//����¡
	@Override
	public List<BoardDTO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return boarddao.listAll();
	}

	//����¡
	@Override
	public List<BoardDTO> listCriteria(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return boarddao.listCriteria(cri);
	}

	//����¡
	@Override
	public int listCountCriteria(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return boarddao.countPaging(cri);
	}
	
}
