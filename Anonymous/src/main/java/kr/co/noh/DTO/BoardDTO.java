package kr.co.noh.DTO;

import java.sql.Date;

public class BoardDTO {
	private int ai_id;
	private String title; //게시글의 제목
	private String content; //게시글의 내용
	private int viewcount; //게시글의 조회수
	private int user_ai_id; //유저의 고유번호(작성자)
	private Date date; //게시글이 달린 날자(년월일만 나옴)
	private int hitcount; //게시글의 추천수
	
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
