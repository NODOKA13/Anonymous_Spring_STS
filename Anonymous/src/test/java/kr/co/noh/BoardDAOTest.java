package kr.co.noh;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import kr.co.noh.Controller.BoardController;
import kr.co.noh.DAO.BoardDAO;
import kr.co.noh.DTO.BoardDTO;
import kr.co.noh.DTO.Criteria;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class BoardDAOTest {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Inject
	private BoardDAO boardDAO;

	@Test
	public void testListPage() throws Exception {

		int page = 3;

		List<BoardDTO> list = boardDAO.listPage(page);

		for (BoardDTO dto : list) {
			logger.info(dto.getUser_ai_id() + ":" + dto.getTitle());
		}
	}

	@Test
	public void testListCriteria() throws Exception {
		Criteria cri = new Criteria();
		cri.setPage(2);
		cri.setPerPageNum(20);

		List<BoardDTO> list = boardDAO.listCriteria(cri);

		for (BoardDTO dto : list) {
			logger.info(dto.getAi_id() + ":" + dto.getTitle());
		}
	}

	@Test
	public void testURI() throws Exception {

		UriComponents uriComponents = UriComponentsBuilder.newInstance().path("/board/detail").queryParam("ai_id", 12)
				.queryParam("perPageNum", 20).build();

		logger.info("/board/detail?ai_id=12&perPageNum=20");
		logger.info(uriComponents.toString());
	}
	
	@Test
	public void testURI2() throws Exception {
		
		UriComponents uriComponents = UriComponentsBuilder.newInstance().path("/{module}/{page}").queryParam("ai_id", 12).queryParam("perPageNum", 20).build().expand("board","detail").encode();
		
		logger.info("/board/detail?ai_id=12&perPageNum=20");
		logger.info(uriComponents.toString());
	}
}