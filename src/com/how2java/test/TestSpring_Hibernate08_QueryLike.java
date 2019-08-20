package com.how2java.test;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.how2java.dao.CategoryDAO;
import com.how2java.pojo.Category;
/**
 * ��ѯ����
 * @author Administrator
 *
 */
public class TestSpring_Hibernate08_QueryLike {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		CategoryDAO dao = (CategoryDAO) context.getBean("dao");
		/**
		 * �ֱ�ʹ��Hql��Criteria����ģ����ѯ
		 */
		
		//Hql
		List<Category> cs = dao.find("from Category c where c.name like ?","%c%");
		
		for (Category category : cs) {
			System.out.println(category.getName());
		}
		
		//Criteria
		DetachedCriteria dc = DetachedCriteria.forClass(Category.class);
		dc.add(Restrictions.like("name", "%����%"));
		cs = dao.findByCriteria(dc);
		
		for (Category category : cs) {
			System.out.println(category.getName());
		}
		
	}
}
