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
	
	//���� �߰� C
	@Override
	public void UserAdd(UserDTO userDTO) {
		// TODO Auto-generated method stub
		sqlsession.insert(namespace+".UserAdd", userDTO);
	}
	
	//���� ��ȸ R
	@Override
	public UserDTO UserDetail(int ai_id) {
		// TODO Auto-generated method stub
		UserDTO UserDetail = sqlsession.selectOne(namespace+".UserDetail");
		return UserDetail;
	}
	
	//���� ���� U
	@Override
	public void UserUpdate(int ai_id) {
		// TODO Auto-generated method stub
		sqlsession.update(namespace+".UserUpdate");
	}
	
	//���� ���� D
	@Override
	public void UserDelete(int ai_id) {
		// TODO Auto-generated method stub
		System.out.println("DAOImp ����");
		sqlsession.delete(namespace+".UserDelete", ai_id);
		System.out.println("DAOImpl ����");
	}

}