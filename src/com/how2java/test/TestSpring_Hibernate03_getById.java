package com.how2java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.how2java.dao.CategoryDAO;
import com.how2java.pojo.Category;
/**
 * ��ȡ
 * @author Administrator
 *
 */
public class TestSpring_Hibernate03_getById {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		CategoryDAO dao = (CategoryDAO) context.getBean("dao");
		//����id��ȡ
		Category c = dao.get(Category.class, 1);
		System.out.println(c.getName());
		
	}
}
