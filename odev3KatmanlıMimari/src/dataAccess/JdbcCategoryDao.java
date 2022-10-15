package dataAccess;

import entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	public void add(Category category) {
		System.out.println("Category, JDBC ile veritabanına eklendi");
	}
	
}
