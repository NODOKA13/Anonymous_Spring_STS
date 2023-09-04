package kr.co.noh.DTO;

public class BoardDTO {
	private String title; //�Խñ��� ����
	private String content; //�Խñ��� ����
	private int viewcount; //�Խñ��� ��ȸ��
	private int user_ai_id; //������ ������ȣ(�ۼ���)
	private int hitCount; //�Խñ��� ��õ��
	
	
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
