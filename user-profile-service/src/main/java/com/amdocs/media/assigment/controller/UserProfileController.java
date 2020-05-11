package com.amdocs.media.assigment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.media.assigment.model.UserProfile;
import com.amdocs.media.assigment.service.UserProfileService;

@RestController
@RequestMapping("/user-profile-service")
public class UserProfileController {
	
	@Autowired
	UserProfileService profileService;
	
	
	@PostMapping("/")
	public String createProfile(@RequestBody UserProfile userProfile ) {
		UserProfile userProfileRes= profileService.createProfile(userProfile);
		if(userProfileRes!=null) {
			return "Profile has been created Succesfully with ID:"+userProfileRes.getId();
		}else
			return "Something went wrong.Please try again.";
	}
	
	@PutMapping("/")
	public String updateProfile(@RequestBody UserProfile userProfile ) {
		
		UserProfile userProfileRes= profileService.updateProfile(userProfile);
		if(userProfileRes!=null) {
			return "Profile has been updated Succesfully";
		}else
			return "Id not found in the System";
	}
	@DeleteMapping("/{id}")
	public String updateProfile(@PathVariable("id")int id ) {
		try {
			profileService.deleteProfile(id);
			return "Profile has been updated Succesfully";
		} catch (Exception e) {
			return "Something went wrong.Please try again.";
		}

		

	}

}
