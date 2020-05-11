package com.amdocs.media.assigment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.media.assigment.model.UserProfile;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Number>{

}
