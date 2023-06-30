package kr.co.two.chat.dto;

import java.sql.Date;

import org.apache.ibatis.type.Alias;

public class ChatDTO {
	private int chat_room_id;
	private String name;
	private String id;
	private String send_id;
	private String subject;
	private String content;
	private boolean is_read;
	private Date send_time;
	private boolean bllind;
	private boolean is_notice;
	
	public int getChat_room_id() {
		return chat_room_id;
	}
	public void setChat_room_id(int chat_room_id) {
		this.chat_room_id = chat_room_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSend_id() {
		return send_id;
	}
	public void setSend_id(String send_id) {
		this.send_id = send_id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public boolean isIs_read() {
		return is_read;
	}
	public void setIs_read(boolean is_read) {
		this.is_read = is_read;
	}
	public Date getSend_time() {
		return send_time;
	}
	public void setSend_time(Date send_time) {
		this.send_time = send_time;
	}
	public boolean isBllind() {
		return bllind;
	}
	public void setBllind(boolean bllind) {
		this.bllind = bllind;
	}
	public boolean isIs_notice() {
		return is_notice;
	}
	public void setIs_notice(boolean is_notice) {
		this.is_notice = is_notice;
	}
	
}
