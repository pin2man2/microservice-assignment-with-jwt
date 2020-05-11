package com.amdocs.media.assigment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.amdocs.media.assigment.dao.UserProfileRepository;
import com.amdocs.media.assigment.model.UserProfile;

@Service
public class UserProfileServiceImpl implements  UserProfileService {
	
	@Autowired
	UserProfileRepository repository;

	@Override
	public UserProfile createProfile(UserProfile userProfile) {
		
		return repository.save(userProfile);
	}

	@Override
	public UserProfile updateProfile(UserProfile userProfile) {
		
		UserProfile userProfileModel= new UserProfile();
		if(userProfile.getAddress()!=null)
		userProfileModel.setAddress(userProfile.getAddress());
		if(userProfile.getPhone()!=null)
			userProfileModel.setPhone(userProfile.getPhone());
		
		return repository.save(userProfileModel);
	}

	@Override
	public void deleteProfile(int userId) {
		
		repository.deleteById(userId);
		
	}
}
