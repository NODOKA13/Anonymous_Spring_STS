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
