package kr.co.noh.service;

import kr.co.noh.DTO.UserDTO;

public interface UserService {
	//���� �߰� C
	public void UserAdd(UserDTO userDTO);
	
	//���� ����ȸ R
	public UserDTO UserDetail(int ai_id);
	
	//���� ���� U
	public void UserUpdate(int ai_id);
	
	//���� ���� D
	public void UserDelete(int ai_id);
}
