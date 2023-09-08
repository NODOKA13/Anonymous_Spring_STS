package kr.co.noh.DAO;

import kr.co.noh.DTO.UserDTO;

public interface UserDAO {
	//유저 추가 C
	public void UserAdd(UserDTO userDTO) throws Exception;
	
	//유저 상세조회 R
	public UserDTO UserDetail(int ai_id) throws Exception;
	
	//유저 수정 U
	public void UserUpdate(int ai_id) throws Exception;
	
	//유저 삭제 D
	public void UserDelete(int ai_id) throws Exception;
}
