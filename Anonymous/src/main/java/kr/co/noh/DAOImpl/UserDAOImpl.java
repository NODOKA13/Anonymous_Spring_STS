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
	private final static String namespace = "kr.co.noh.mappers.UserMapper"; 
	
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
		//System.out.println("DAOImpl ����");
		UserDTO userDetail = sqlsession.selectOne(namespace + ".UserDetail", ai_id);
		//System.out.println("DAOImpl ����");
		return userDetail;
	}
	
	//���� ���� U
	@Override
	public void UserUpdate(int ai_id) {
		// TODO Auto-generated method stub
		sqlsession.update(namespace+".UserUpdate", ai_id);
	}
	
	//���� ���� D
	@Override
	public void UserDelete(int ai_id) {
		// TODO Auto-generated method stub
		sqlsession.delete(namespace+".UserDelete", ai_id);
	}

}
