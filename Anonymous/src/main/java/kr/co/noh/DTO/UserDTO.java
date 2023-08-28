package kr.co.noh.DTO;

public class UserDTO {
	private String ID;
	private String Password;
	private int AI_ID;
	
	@Override
	public String toString() {
		return "UserDTO [ID=" + ID + ", Password=" + Password + ", AI_ID=" + AI_ID + "]";
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
	public int getAI_ID() {
		return AI_ID;
	}
	public void setAI_ID(int aI_ID) {
		AI_ID = aI_ID;
	}
	
	
}
