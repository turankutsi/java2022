package business;

import java.util.ArrayList;
import java.util.List;

import core.logging.Logger;
import dataAccess.CategoryDao;
import entities.Category;

public class CategoryManager { // Category ismi tekrar edemez.

	private CategoryDao categoryDao;
	private Logger[] loggers;
	public static List<String> categories = new ArrayList<>();

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void addCategory(Category category) throws Exception {
		if (categories.contains(category.getCategoryName())) {
			throw new Exception("Category ismi tekrar edemez");
		} else {
			System.out.println("Category eklendi : " + category.getCategoryName());
			categories.add(category.getCategoryName());
			categoryDao.add(category);
			for (Logger logger : loggers) {
				logger.log(category.getCategoryName());
			}
		}
	}

}
