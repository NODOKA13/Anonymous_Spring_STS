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
	
	//유저 추가 C
	@Override
	public void UserAdd(UserDTO userDTO) {
		// TODO Auto-generated method stub
		userdao.UserAdd(userDTO);
	}

	//유저 상세조회 R
	@Override
	public UserDTO UserDetail(int ai_id) {
		// TODO Auto-generated method stub
		return userdao.UserDetail(ai_id);
	}

	//유저 수정 U
	@Override
	public void UserUpdate(int ai_id) {
		// TODO Auto-generated method stub
		userdao.UserUpdate(ai_id);
	}

	//유저 삭제 D
	@Override
	public void UserDelete(int ai_id) {
		// TODO Auto-generated method stub
		userdao.UserDelete(ai_id);
	}

}
