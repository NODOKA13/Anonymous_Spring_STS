package kr.co.noh.DTO;

import java.sql.Date;

public class BoardDTO {
	private int ai_id;
	private String title; //�Խñ��� ����
	private String content; //�Խñ��� ����
	private int viewcount; //�Խñ��� ��ȸ��
	private int user_ai_id; //������ ������ȣ(�ۼ���)
	private Date date; //�Խñ��� �޸� ����(����ϸ� ����)
	private int hitcount; //�Խñ��� ��õ��
	
	@Override
	public String toString() {
		return "BoardDTO [ai_id=" + ai_id + ", title=" + title + ", content=" + content + ", viewcount=" + viewcount
				+ ", user_ai_id=" + user_ai_id + ", date=" + date + ", hitcount=" + hitcount + "]";
	}
	
	public int getAi_id() {
		return ai_id;
	}
	public void setAi_id(int ai_id) {
		this.ai_id = ai_id;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getHitcount() {
		return hitcount;
	}
	public void setHitcount(int hitcount) {
		this.hitcount = hitcount;
	}
	
	
}
