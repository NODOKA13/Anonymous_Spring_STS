package kr.co.noh;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.noh.Controller.BoardController;
import kr.co.noh.DAO.BoardDAO;
import kr.co.noh.DTO.BoardDTO;
import kr.co.noh.DTO.Criteria;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class BoardDAOTest {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Inject
	private BoardDAO boardDAO;
	
	@Test
	public void testListPage() throws Exception {
		
		int page = 3;
		
		List<BoardDTO> list = boardDAO.listPage(page);
		
		for(BoardDTO dto : list) {
			logger.info(dto.getUser_ai_id() + ":" + dto.getTitle());
		}
	}
	
	@Test
	public void testListCriteria() throws Exception{
		Criteria cri = new Criteria();
		cri.setPage(2);
		cri.setPerPageNum(20);
		
		List<BoardDTO> list = boardDAO.listCriteria(cri);
		
		for(BoardDTO dto : list) {
			logger.info(dto.getAi_id() + ":" + dto.getTitle());
		}
	}
}