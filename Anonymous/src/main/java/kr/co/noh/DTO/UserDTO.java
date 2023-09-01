package kr.co.noh.DTO;

public class UserDTO {
	private String id;
	private String password;
	
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", password=" + password + "]";
	}
	
	public String getid() {
		return id;
	}
	public void setid(String id) {
		id = id;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		password = password;
	}
	
	
}
