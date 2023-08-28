package kr.co.noh.DTO;

public class ArticleDTO {
	private int AI_Id;
	private String Content;
	private int Board_AI_ID;
	private int User_AI_ID;
	private int HitCount;
	
	
	@Override
	public String toString() {
		return "ArticleDTO [AI_Id=" + AI_Id + ", Content=" + Content + ", Board_AI_ID=" + Board_AI_ID + ", User_AI_ID="
				+ User_AI_ID + ", HitCount=" + HitCount + "]";
	}
	
	public int getAI_Id() {
		return AI_Id;
	}
	public void setAI_Id(int aI_Id) {
		AI_Id = aI_Id;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public int getBoard_AI_ID() {
		return Board_AI_ID;
	}
	public void setBoard_AI_ID(int board_AI_ID) {
		Board_AI_ID = board_AI_ID;
	}
	public int getUser_AI_ID() {
		return User_AI_ID;
	}
	public void setUser_AI_ID(int user_AI_ID) {
		User_AI_ID = user_AI_ID;
	}
	public int getHitCount() {
		return HitCount;
	}
	public void setHitCount(int hitCount) {
		HitCount = hitCount;
	}
	
	
}
