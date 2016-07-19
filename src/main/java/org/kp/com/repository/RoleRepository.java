package org.kp.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.kp.com.entity.Role;

public interface RoleRepository  extends JpaRepository<Role, Integer>{

}
