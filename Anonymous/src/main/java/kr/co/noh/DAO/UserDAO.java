package kr.co.noh.DAO;

import kr.co.noh.DTO.UserDTO;

public interface UserDAO {
	//���� �߰� C
	public void UserAdd(UserDTO userDTO) throws Exception;
	
	//���� ����ȸ R
	public UserDTO UserDetail(int ai_id) throws Exception;
	
	//���� ���� U
	public void UserUpdate(int ai_id) throws Exception;
	
	//���� ���� D
	public void UserDelete(int ai_id) throws Exception;
}
