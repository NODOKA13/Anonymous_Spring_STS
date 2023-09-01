package kr.co.noh;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.noh.DAO.UserDAO;
import kr.co.noh.DTO.UserDTO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class UserDAOTest {
	
	@Inject
	private UserDAO userdao;
	
	@Test
	public void testUserDelete() {
		System.out.println("����Ʈ");
		userdao.UserDelete(1);
		System.out.println("����");
	}
}