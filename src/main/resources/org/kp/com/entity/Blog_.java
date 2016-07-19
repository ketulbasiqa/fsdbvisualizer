package org.kp.com.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-07-18T21:34:37.217-0400")
@StaticMetamodel(Blog.class)
public class Blog_ {
	public static volatile SingularAttribute<Blog, Integer> id;
	public static volatile SingularAttribute<Blog, String> url;
	public static volatile SingularAttribute<Blog, String> name;
	public static volatile SingularAttribute<Blog, User> user;
	public static volatile ListAttribute<Blog, Item> items;
}
