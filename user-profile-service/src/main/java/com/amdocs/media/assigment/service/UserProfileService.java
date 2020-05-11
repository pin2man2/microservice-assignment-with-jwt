package com.amdocs.media.assigment.service;

import com.amdocs.media.assigment.model.UserProfile;

public interface UserProfileService {
	
	
	public UserProfile createProfile(UserProfile userProfile );
	public UserProfile updateProfile(UserProfile userProfile );
	public void deleteProfile(int userId);

}
