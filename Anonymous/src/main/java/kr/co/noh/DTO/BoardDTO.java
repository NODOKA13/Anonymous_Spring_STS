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
	
	public String gettitle() {
		return title;
	}
	public void settitle(String title) {
		title = title;
	}
	public String getcontent() {
		return content;
	}
	public void setcontent(String content) {
		content = content;
	}
	public int getviewcount() {
		return viewcount;
	}
	public void setviewcount(int viewcount) {
		viewcount = viewcount;
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
