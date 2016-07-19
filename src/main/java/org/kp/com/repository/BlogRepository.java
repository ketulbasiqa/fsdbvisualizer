package org.kp.com.repository;

import org.kp.com.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository  extends JpaRepository<Blog, Integer>{

}
