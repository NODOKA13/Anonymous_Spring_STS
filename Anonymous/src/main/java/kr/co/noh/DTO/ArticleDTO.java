package kr.co.noh.DTO;

import java.sql.Date;

public class ArticleDTO {
	private int ai_id; //����� ������ȣ
	private String content; //����� ����
	private int board_ai_id; //������ ������ȣ(����� ���� �Խñ��� ������ȣ)
	private int user_ai_id; //������ ������ȣ(�ۼ���)
	private Date date; //����� �޸� ����(����ϸ� ����)
	private int hitCount; //����� ��õ��
	
	@Override
	public String toString() {
		return "ArticleDTO [ai_id=" + ai_id + ", content=" + content + ", board_ai_id=" + board_ai_id + ", user_ai_id="
				+ user_ai_id + ", date=" + date + ", hitCount=" + hitCount + "]";
	}
	public int getAi_id() {
		return ai_id;
	}
	public void setAi_id(int ai_id) {
		this.ai_id = ai_id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getBoard_ai_id() {
		return board_ai_id;
	}
	public void setBoard_ai_id(int board_ai_id) {
		this.board_ai_id = board_ai_id;
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
	public int getHitCount() {
		return hitCount;
	}
	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}
	
	
	
}
