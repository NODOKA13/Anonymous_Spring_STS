package kr.co.noh.DTO;

public class Board_hitDTO {
	private int User_AI_ID;
	private int Board_AI_ID;
	
	
	@Override
	public String toString() {
		return "Board_hitDTO [User_AI_ID=" + User_AI_ID + ", Board_AI_ID=" + Board_AI_ID + "]";
	}
	
	public int getUser_AI_ID() {
		return User_AI_ID;
	}
	public void setUser_AI_ID(int user_AI_ID) {
		User_AI_ID = user_AI_ID;
	}
	public int getBoard_AI_ID() {
		return Board_AI_ID;
	}
	public void setBoard_AI_ID(int board_AI_ID) {
		Board_AI_ID = board_AI_ID;
	}
	
	
}
