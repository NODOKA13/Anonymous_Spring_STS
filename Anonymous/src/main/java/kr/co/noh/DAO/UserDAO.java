package kr.co.noh.DAO;

import kr.co.noh.DTO.UserDTO;

public interface UserDAO {
	//유저 추가 C
	public void UserAdd(UserDTO UserDTO);
	
	//유저 상세조회 R
	public UserDTO UserDetail(int AI_ID);
	
	//유저 수정 U
	public void UserUpdate(int AI_ID);
	
	//유저 삭제 D
	public void UserDelete(int AI_ID);
}
