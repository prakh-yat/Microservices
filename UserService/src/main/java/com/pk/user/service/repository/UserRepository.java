package com.pk.user.service.repository;

import com.pk.user.service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,String>{

}
