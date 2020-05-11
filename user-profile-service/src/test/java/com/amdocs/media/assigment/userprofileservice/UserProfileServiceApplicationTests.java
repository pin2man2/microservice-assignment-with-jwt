package com.amdocs.media.assigment.userprofileservice;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.Assert;

import com.amdocs.media.assigment.dao.UserProfileRepository;
import com.amdocs.media.assigment.model.UserProfile;
import com.amdocs.media.assigment.service.UserProfileService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class UserProfileServiceApplicationTests {
	@Autowired
	UserProfileService profileService;
	@MockBean
	UserProfileRepository repository;
	

	@Test
	public void createProfileTest() {
		UserProfile userProf = new UserProfile();
		userProf.setId(1);
		userProf.setAddress("Pune");
		userProf.setPhone(799880000);
		
		when(repository.save(userProf)).thenReturn(userProf);
	    assertEquals(userProf, profileService.createProfile(userProf));
	}
	@Test
	public void updateProfileTest() {
		UserProfile userProf = new UserProfile();
		userProf.setId(1);
		userProf.setAddress("Hyd");
		userProf.setPhone(799880990);
		when(repository.save(userProf)).thenReturn(userProf);
	}
	@Test
	public void deleteProfileTest() {
		profileService.deleteProfile(1);
		verify(repository,times(1)).deleteById(1);
	}
	

}
