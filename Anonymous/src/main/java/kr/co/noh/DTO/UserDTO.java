package kr.co.noh.DTO;

public class UserDTO {
	private String ID;
	private String Password;
	
	@Override
	public String toString() {
		return "UserDTO [ID=" + ID + ", Password=" + Password + "]";
	}
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
}
