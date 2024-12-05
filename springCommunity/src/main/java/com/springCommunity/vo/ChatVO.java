package com.springCommunity.vo;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;


public class ChatVO{
	private int CHAT_NO;
	private String CHAT_NAME;
	private String CHAT_DATE;
	private String CHAT_STATE;
	private int CHAT_GROUP;
	private String USER_ID;
	
	public ChatVO() {}

    public ChatVO(int CHAT_NO, String USER_ID) {
        this.CHAT_NO = CHAT_NO;
        this.USER_ID = USER_ID;
    }
	
	public int getCHAT_NO() {
		return CHAT_NO;
	}
	public String getCHAT_NAME() {
		return CHAT_NAME;
	}
	public String getCHAT_DATE() {
		return CHAT_DATE;
	}
	public String getCHAT_STATE() {
		return CHAT_STATE;
	}
	public int getCHAT_GROUP() {
		return CHAT_GROUP;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	
	public void setCHAT_NO(int cHAT_NO) {
		CHAT_NO = cHAT_NO;
	}
	public void setCHAT_NAME(String cHAT_NAME) {
		CHAT_NAME = cHAT_NAME;
	}
	public void setCHAT_DATE(String cHAT_DATE) {
		CHAT_DATE = cHAT_DATE;
	}
	public void setCHAT_STATE(String cHAT_STATE) {
		CHAT_STATE = cHAT_STATE;
	}
	public void setCHAT_GROUP(int cHAT_GROUP) {
		CHAT_GROUP = cHAT_GROUP;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	
	
}