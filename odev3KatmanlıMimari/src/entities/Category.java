package entities;

public class Category {

	private String categoryName;

	public Category() {
		// Default constructor
	}
	
	public Category(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
}
