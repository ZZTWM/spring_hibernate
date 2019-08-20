package com.how2java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.how2java.dao.CategoryDAO;
import com.how2java.pojo.Category;
/**
 * 增加
 * @author Administrator
 *
 */
public class TestSpring_Hibernate02_add {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		CategoryDAO dao = (CategoryDAO) context.getBean("dao");
		
		Category c = new Category();
		c.setName("category xxx");
		//增加
		dao.save(c);
		
	}
}
