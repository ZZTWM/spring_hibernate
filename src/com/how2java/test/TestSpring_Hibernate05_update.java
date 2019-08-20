package com.how2java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.how2java.dao.CategoryDAO;
import com.how2java.pojo.Category;
/**
 * 修改
 * @author Administrator
 *
 */
public class TestSpring_Hibernate05_update {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		CategoryDAO dao = (CategoryDAO) context.getBean("dao");
		
		Category c = dao.get(Category.class, 1);
		c.setName("华为-修改");
		//修改
		dao.update(c);
		System.out.println(c.getName());
	}
}
