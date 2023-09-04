package kr.co.noh.DTO;

public class UserDTO {
	private String id;
	private String password;
	private String ai_id;
	
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", password=" + password + ", ai_id=" + ai_id + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAi_id() {
		return ai_id;
	}
	public void setAi_id(String ai_id) {
		this.ai_id = ai_id;
	}
	
	
	
}
