package quiz23;

public class Product {
	
	private String day;
	private String store;
	private String grade;
	private String ex;
	private String price;
	
	public Product() {
		
	}


	public Product(String day, String store, String grade, String ex, String price) {
		super();
		this.day = day;
		this.store = store;
		this.grade = grade;
		this.ex = ex;
		this.price = price;
	}


	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getEx() {
		return ex;
	}

	public void setEx(String ex) {
		this.ex = ex;
	}

}
