package kr.co.noh.serviceImpl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.noh.DAO.UserDAO;
import kr.co.noh.DTO.UserDTO;
import kr.co.noh.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Inject
	private UserDAO userdao;
	
	//���� �߰� C
	@Override
	public void UserAdd(UserDTO userDTO) {
		// TODO Auto-generated method stub
		userdao.UserAdd(userDTO);
	}

	//���� ����ȸ R
	@Override
	public UserDTO UserDetail(int ai_id) {
		// TODO Auto-generated method stub
		return userdao.UserDetail(ai_id);
	}

	//���� ���� U
	@Override
	public void UserUpdate(int ai_id) {
		// TODO Auto-generated method stub
		userdao.UserUpdate(ai_id);
	}

	//���� ���� D
	@Override
	public void UserDelete(int ai_id) {
		// TODO Auto-generated method stub
		userdao.UserDelete(ai_id);
	}

}
