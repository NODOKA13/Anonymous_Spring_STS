package kr.co.noh.DAO;

import kr.co.noh.DTO.UserDTO;

public interface UserDAO {
	//���� �߰� C
	public void UserAdd(UserDTO userDTO);
	
	//���� ����ȸ R
	public UserDTO UserDetail(int ai_id);
	
	//���� ���� U
	public void UserUpdate(int ai_id);
	
	//���� ���� D
	public void UserDelete(int ai_id);
}
