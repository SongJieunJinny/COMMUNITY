package com.springCommunity.vo;

public class ChatMessageVO {
    private int CHAT_MESSAGE_NO;
    private int CHAT_NO;
    private String CHAT_MESSAGE_CONTENT;
    private String USER_ID;

    public int getCHAT_MESSAGE_NO() {
        return CHAT_MESSAGE_NO;
    }

    public void setCHAT_MESSAGE_NO(int CHAT_MESSAGE_NO) {
        this.CHAT_MESSAGE_NO = CHAT_MESSAGE_NO;
    }

    public int getCHAT_NO() {
        return CHAT_NO;
    }

    public void setCHAT_NO(int CHAT_NO) {
        this.CHAT_NO = CHAT_NO;
    }

    public String getCHAT_MESSAGE_CONTENT() {
        return CHAT_MESSAGE_CONTENT;
    }

    public void setCHAT_MESSAGE_CONTENT(String CHAT_MESSAGE_CONTENT) {
        this.CHAT_MESSAGE_CONTENT = CHAT_MESSAGE_CONTENT;
    }

    public String getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID;
    }
}