package kr.co.noh.DAOImpl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.noh.DAO.UserDAO;
import kr.co.noh.DTO.UserDTO;

@Repository
public class UserDAOImpl implements UserDAO{
	@Autowired
	private SqlSession sqlsession;
	private final static String namespace = "kr.co.noh.UserMapper"; 
	
	//유저 추가 C
	@Override
	public void UserAdd(UserDTO userDTO) {
		// TODO Auto-generated method stub
		sqlsession.insert(namespace+".UserAdd", userDTO);
	}
	
	//유저 조회 R
	@Override
	public UserDTO UserDetail(int ai_id) {
		// TODO Auto-generated method stub
		UserDTO UserDetail = sqlsession.selectOne(namespace+".UserDetail");
		return UserDetail;
	}
	
	//유저 수정 U
	@Override
	public void UserUpdate(int ai_id) {
		// TODO Auto-generated method stub
		sqlsession.update(namespace+".UserUpdate");
	}
	
	//유저 삭제 D
	@Override
	public void UserDelete(int ai_id) {
		// TODO Auto-generated method stub
		System.out.println("DAOImp 진입");
		sqlsession.delete(namespace+".UserDelete", ai_id);
		System.out.println("DAOImpl 성공");
	}

}
