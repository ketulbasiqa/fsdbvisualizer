package org.kp.com.repository;

import org.kp.com.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Integer>{

}
