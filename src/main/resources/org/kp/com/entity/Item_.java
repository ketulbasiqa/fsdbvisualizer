package org.kp.com.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-07-18T21:34:37.219-0400")
@StaticMetamodel(Item.class)
public class Item_ {
	public static volatile SingularAttribute<Item, Integer> id;
	public static volatile SingularAttribute<Item, String> title;
	public static volatile SingularAttribute<Item, String> description;
	public static volatile SingularAttribute<Item, Date> publishedDate;
	public static volatile SingularAttribute<Item, String> link;
	public static volatile SingularAttribute<Item, Blog> blog;
}
