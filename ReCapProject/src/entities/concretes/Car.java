package entities.concretes;

public class Car {
	private int carId;
	private int brandId;
	private int colorId;
	private String modelYear;
	private double dailyPrice;
	private String description;
	
	
	public Car() {
		super();
	}

	public Car(int carId, int brandId, int colorId, String modelYear, double dailyPrice, String description) {
		super();
		this.carId = carId;
		this.brandId = brandId;
		this.colorId = colorId;
		this.modelYear = modelYear;
		this.dailyPrice = dailyPrice;
		this.description = description;
	}

	public int getCarId() {
		return carId;
	}


	public void setCarId(int carId) {
		this.carId = carId;
	}


	public int getBrandId() {
		return brandId;
	}


	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}


	public int getColorId() {
		return colorId;
	}


	public void setColorId(int colorId) {
		this.colorId = colorId;
	}


	public String getModelYear() {
		return modelYear;
	}


	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}


	public double getDailyPrice() {
		return dailyPrice;
	}


	public void setDailyPrice(double dailyPrice) {
		this.dailyPrice = dailyPrice;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
}
