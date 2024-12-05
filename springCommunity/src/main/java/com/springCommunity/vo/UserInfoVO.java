package com.springCommunity.vo;

public class UserInfoVO{
	
	private String USER_ID;
	private String USER_PASSWORD;
	private String USER_NAME;
	private String USER_EMAIL;
	private String USER_PHONE;
	private String USER_JOIN_DATE;
	private String USER_ACCOUNT;
	private String USER_AUTHORITY;
	private boolean USER_ENABLED;
	private int DEPARTMENT_ID; 
	private int JOB_POSITION_ID;
	private int BANK_ID;
	private String USER_ADDRESS;
	private String DEPARTMENT_NAME;
	private String JOB_POSITION_NAME;
	
	public String getUSER_ID()           { return USER_ID;         }
	public String getUSER_PASSWORD()     { return USER_PASSWORD;   }
	public String getUSER_NAME()         { return USER_NAME;       }
	public String getUSER_EMAIL()        { return USER_EMAIL;      }
	public String getUSER_PHONE()        { return USER_PHONE;      }
	public String getUSER_JOIN_DATE()    { return USER_JOIN_DATE;  }
	public String getUSER_ACCOUNT()      { return USER_ACCOUNT;    }
	public String getUSER_AUTHORITY()    { return USER_AUTHORITY;  }
	public boolean isUSER_ENABLED()      { return USER_ENABLED;    }
	public int getDEPARTMENT_ID()        { return DEPARTMENT_ID;   }
	public int getJOB_POSITION_ID()      { return JOB_POSITION_ID; }
	public int getBANK_ID()              { return BANK_ID;         }
	public String getUSER_ADDRESS()      { return USER_ADDRESS;    }
	public String getDEPARTMENT_NAME()   { return DEPARTMENT_NAME;  }
	public String getJOB_POSITION_NAME() { return JOB_POSITION_NAME;}
	
	public void setUSER_ID(String uSER_ID)                     { USER_ID = uSER_ID;                 }
	public void setUSER_PASSWORD(String uSER_PASSWORD)         { USER_PASSWORD = uSER_PASSWORD;     }
	public void setUSER_NAME(String uSER_NAME)                 { USER_NAME = uSER_NAME;             }
	public void setUSER_EMAIL(String uSER_EMAIL)               { USER_EMAIL = uSER_EMAIL;           }
	public void setUSER_PHONE(String uSER_PHONE)               { USER_PHONE = uSER_PHONE;           }
	public void setUSER_JOIN_DATE(String uSER_JOIN_DATE)       { USER_JOIN_DATE = uSER_JOIN_DATE;   }
	public void setUSER_ACCOUNT(String uSER_ACCOUNT)           { USER_ACCOUNT = uSER_ACCOUNT;       }
	public void setUSER_AUTHORITY(String uSER_aUTHORITY)       { USER_AUTHORITY = uSER_aUTHORITY;   }
	public void setUSER_ENABLED(boolean uSER_eNABLED)          { USER_ENABLED = uSER_eNABLED;       }
	public void setDEPARTMENT_ID(int dEPARTMENT_ID)            { DEPARTMENT_ID = dEPARTMENT_ID;     }
	public void setJOB_POSITION_ID(int jOB_POSITION_ID)        { JOB_POSITION_ID = jOB_POSITION_ID; }
	public void setBANK_ID(int bANK_ID)                        { BANK_ID = bANK_ID;                 }
	public void setUSER_ADDRESS(String uSER_aDDRESS)           { USER_ADDRESS = uSER_aDDRESS;       }
	public void setDEPARTMENT_NAME(String dEPARTMENT_NAME)     { DEPARTMENT_NAME = dEPARTMENT_NAME;    }
	public void setJOB_POSITION_NAME(String jOB_POSITION_NAME) { JOB_POSITION_NAME = jOB_POSITION_NAME;}
}