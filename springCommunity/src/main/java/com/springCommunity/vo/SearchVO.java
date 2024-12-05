package com.springCommunity.vo;

import com.springCommunity.util.PagingUtil;

public class SearchVO extends PagingUtil {
	private String searchType;
	private String searchValue;
	private String USER_ID;
	
	public String getSearchType()  { return searchType;  }
	public String getSearchValue() { return searchValue; }
	public String getUSER_ID()     { return USER_ID;     }
	
	public void setSearchType(String searchType)   { this.searchType = searchType;   }
	public void setSearchValue(String searchValue) { this.searchValue = searchValue; }
	public void setUSER_ID(String uSER_ID)         { USER_ID = uSER_ID;              }
}
