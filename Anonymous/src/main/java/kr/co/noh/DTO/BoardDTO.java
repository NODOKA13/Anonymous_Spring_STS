package kr.co.noh.DTO;

public class BoardDTO {
	private String title; //게시글의 제목
	private String content; //게시글의 내용
	private int viewcount; //게시글의 조회수
	private int user_ai_id; //유저의 고유번호(작성자)
	private int hitCount; //게시글의 추천수
	
	@Override
	public String toString() {
		return "BoardDTO [title=" + title + ", content=" + content + ", viewcount=" + viewcount + ", user_ai_id="
				+ user_ai_id + ", hitCount=" + hitCount + "]";
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getViewcount() {
		return viewcount;
	}
	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}
	public int getUser_ai_id() {
		return user_ai_id;
	}
	public void setUser_ai_id(int user_ai_id) {
		this.user_ai_id = user_ai_id;
	}
	public int getHitCount() {
		return hitCount;
	}
	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}
	
	
	
	
}
