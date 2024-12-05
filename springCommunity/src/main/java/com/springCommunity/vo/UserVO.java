package com.springCommunity.vo;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class UserVO extends User{
	
	private String user_id;
	private String authority;
	private boolean enabled;
	private String user_name;
	
	public UserVO(String username, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities,
			String authority,String user_name) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
		
		this.user_id = username;
		this.authority = authority;
		this.enabled = enabled;
		this.user_name = user_name;
	}

	public String getUser_id()   { return user_id;   }
	public String getAuthority() { return authority; }
	public boolean isEnabled()   { return enabled;   }
	public String getUser_name() { return user_name; }
}