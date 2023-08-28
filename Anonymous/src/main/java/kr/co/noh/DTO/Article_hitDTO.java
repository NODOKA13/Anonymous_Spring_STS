package kr.co.noh.DTO;

public class Article_hitDTO {
	private int User_AI_ID;
	private int Article_AI_Id;
	
	@Override
	public String toString() {
		return "Article_hitDTO [User_AI_ID=" + User_AI_ID + ", Article_AI_Id=" + Article_AI_Id + "]";
	}
	public int getUser_AI_ID() {
		return User_AI_ID;
	}
	public void setUser_AI_ID(int user_AI_ID) {
		User_AI_ID = user_AI_ID;
	}
	public int getArticle_AI_Id() {
		return Article_AI_Id;
	}
	public void setArticle_AI_Id(int article_AI_Id) {
		Article_AI_Id = article_AI_Id;
	}
	
	
}
