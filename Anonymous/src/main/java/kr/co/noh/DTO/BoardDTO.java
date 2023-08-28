package kr.co.noh.DTO;

public class BoardDTO {
	private String Title;
	private String Content;
	private int ViewCount;
	private int User_AI_ID;
	private int HitCount;
	
	
	@Override
	public String toString() {
		return "BoardDTO [Title=" + Title + ", Content=" + Content + ", ViewCount=" + ViewCount + ", User_AI_ID="
				+ User_AI_ID + ", HitCount=" + HitCount + "]";
	}
	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public int getViewCount() {
		return ViewCount;
	}
	public void setViewCount(int viewCount) {
		ViewCount = viewCount;
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
