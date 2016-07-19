package org.kp.com.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;






import org.kp.com.entity.Blog;
import org.kp.com.entity.Item;
import org.kp.com.entity.Role;
import org.kp.com.entity.User;
import org.kp.com.repository.BlogRepository;
import org.kp.com.repository.ItemRepository;
import org.kp.com.repository.RoleRepository;
import org.kp.com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class InitDbService {

	@Autowired
	private RoleRepository roleRepository;
	
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	private BlogRepository blogRepository;
	
	@PostConstruct
	public void init(){
		
		Role roleUser = new Role();
		roleUser.setName("ROLE_USER");
		roleRepository.save(roleUser);
		
		Role roleAdmin = new Role();
		roleAdmin.setName("ROLE_ADMIN");
		roleRepository.save(roleAdmin);
		
		User userAdmin = new User();
		userAdmin.setName("admin");
		List<Role> roles = new ArrayList<Role>();
		roles.add(roleAdmin);
		roles.add(roleUser);
		userAdmin.setRoles(roles);
		userRepository.save(userAdmin);
		
		Blog blogKp = new Blog();
		blogKp.setName("KPBlog");
		blogKp.setUrl("http://feeds.feedburner.com/javavids?format=xml");
		blogKp.setUser(userAdmin);
		blogRepository.save(blogKp);
		
		
		Item item1 = new Item();
		item1.setBlog(blogKp);
		item1.setTitle("first");
		item1.setLink("http://pixiera.com");
		item1.setPublishedDate(new Date());
		itemRepository.saveAndFlush(item1);
		
		Item item2 = new Item();
		item2.setBlog(blogKp);
		item2.setTitle("second");
		item2.setLink("http://pixiera.com");
		item2.setPublishedDate(new Date());
		itemRepository.save(item2);
		
		
		
	}
	
}
