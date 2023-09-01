package kr.co.noh.DTO;

public class ArticleDTO {
	private int ai_id;
	private String content;
	private int board_ai_id;
	private int user_ai_id;
	private int hitCount;
	
	
	@Override
	public String toString() {
		return "ArticleDTO [ai_id=" + ai_id + ", content=" + content + ", board_ai_id=" + board_ai_id + ", user_ai_id="
				+ user_ai_id + ", hitCount=" + hitCount + "]";
	}
	
	public int getai_id() {
		return ai_id;
	}
	public void setai_id(int ai_id) {
		ai_id = ai_id;
	}
	public String getcontent() {
		return content;
	}
	public void setcontent(String content) {
		content = content;
	}
	public int getboard_ai_id() {
		return board_ai_id;
	}
	public void setboard_ai_id(int board_ai_id) {
		board_ai_id = board_ai_id;
	}
	public int getuser_ai_id() {
		return user_ai_id;
	}
	public void setuser_ai_id(int user_ai_id) {
		user_ai_id = user_ai_id;
	}
	public int gethitCount() {
		return hitCount;
	}
	public void sethitCount(int hitCount) {
		hitCount = hitCount;
	}
	
	
}
