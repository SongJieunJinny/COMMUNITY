package com.springCommunity.vo;

import com.springCommunity.util.PagingUtil;

public class SearchVO extends PagingUtil {
	private String search_type;
	private String search_value;
	private String user_id;
	private int chat_no;
	
	public String getSearch_type()  { return search_type;  }
	public String getSearch_value() { return search_value; }
	public String getUser_id()      { return user_id;      }
	public int getChat_no()         { return chat_no;      }
	
	public void setSearch_type(String search_type)   { this.search_type = search_type;   }
	public void setSearch_value(String search_value) { this.search_value = search_value; }
	public void setUser_id(String user_id)           { this.user_id = user_id;           }
	public void setChat_no(int chat_no)              { this.chat_no = chat_no;           }
}
