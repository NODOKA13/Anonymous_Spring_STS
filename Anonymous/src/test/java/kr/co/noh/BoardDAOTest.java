package kr.co.noh;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.noh.DTO.BoardDTO;

//https://tlatmsrud.tistory.com/36
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class BoardDAOTest {
	
	@Inject
	private kr.co.noh.DAO.BoardDAO dao;
	
	@Test
	public void testBoardDetail() {
		BoardDTO dto = new BoardDTO();
		dto.setTitle("Test Title");
		dto.setContent("Test Content");
		dto.setViewCount(0);
		dto.setHitCount(0);
		
		System.out.println("DAO 입력 이전");
		dao.BoardWrite(dto);
		
		System.out.println("성공");
	}
}
