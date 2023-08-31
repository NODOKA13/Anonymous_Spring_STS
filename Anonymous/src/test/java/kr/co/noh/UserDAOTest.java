package kr.co.noh;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.noh.DTO.UserDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class UserDAOTest {
	
	@Inject
	private kr.co.noh.DAO.UserDAO UserDAO;
	
	@Test
	public void testUserAdd() {
		UserDTO UserDTO = new UserDTO();
		UserDTO.setID("1");
		UserDTO.setPassword("1");
		
		System.out.println("입력이전2134");
		UserDAO.UserAdd(UserDTO);
		
		System.out.println("성공");
	}
}