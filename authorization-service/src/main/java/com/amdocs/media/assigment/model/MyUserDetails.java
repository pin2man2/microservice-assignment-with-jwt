package com.amdocs.media.assigment.model;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails implements UserDetails  {
	 private String userName;
	    private String password;
	    
		public MyUserDetails(User user) {
			super();
			this.userName = user.getUserName();
			this.password = user.getPassword();
		}
		 
		    @Override
		    public String getPassword() {
		        return password;
		    }

		    @Override
		    public String getUsername() {
		        return userName;
		    }

		    @Override
		    public boolean isAccountNonExpired() {
		        return true;
		    }

		    @Override
		    public boolean isAccountNonLocked() {
		        return true;
		    }

		    @Override
		    public boolean isCredentialsNonExpired() {
		        return true;
		    }

		    @Override
		    public boolean isEnabled() {
		        return true;
		    }

			@Override
			public Collection<? extends GrantedAuthority> getAuthorities() {
				return null;
			}  
	    

}
