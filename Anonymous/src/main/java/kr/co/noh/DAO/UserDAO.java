package kr.co.noh.DAO;

import kr.co.noh.DTO.UserDTO;

public interface UserDAO {
	//���� �߰� C
	public void UserAdd(UserDTO UserDTO);
	
	//���� ����ȸ R
	public UserDTO UserDetail(int AI_ID);
	
	//���� ���� U
	public void UserUpdate(int AI_ID);
	
	//���� ���� D
	public void UserDelete(int AI_ID);
}
