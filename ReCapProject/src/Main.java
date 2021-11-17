import business.abstracts.BrandService;
import business.abstracts.CarService;
import business.abstracts.ColorService;
import business.concretes.BrandManager;
import business.concretes.CarManager;
import business.concretes.ColorManager;
import dataAccess.concretes.BrandDao;
import dataAccess.concretes.CarDao;
import dataAccess.concretes.ColorDao;
import entities.concretes.Brand;
import entities.concretes.Car;
import entities.concretes.Color;

public class Main {

	public static void main(String[] args) {
		CarService carService = new CarManager(new CarDao());
		carService.add(new Car(1,1,1,"2015",1000,"24 saatlik kullanım"));
		carService.add(new Car(2,1,2,"2018",1500,"24 saatlik kullanım"));
		//carService.remove(1);
		carService.update(1, new Car(1,3,3,"2016",1500,"24 saatlik kullanım"));
		BrandService brandService = new BrandManager(new BrandDao());
		brandService.add(new Brand(1,"Ford"));
		brandService.add(new Brand(2,"Opel"));
		ColorService colorService = new ColorManager(new ColorDao());
		colorService.add(new Color(1,"Mavi"));
		colorService.add(new Color(2, "Yeşil"));
		if(carService.getById(1).getDailyPrice() == carService.getById(2).getDailyPrice()) {
			System.out.println("prices are same");
		} else {
			System.out.println("prices are different");
		}
		
		
		for (Car cars : carService.getAll().getData()) {
			System.out.println(cars.getCarId() + " " +  cars.getBrandId() + " " + cars.getColorId() + " " + cars.getDailyPrice() + " " + cars.getModelYear() + " " + cars.getDescription());
		}
		for (Brand brands : brandService.getAll().getData()) {
			System.out.println(brands.getBrandId() + " " +  brands.getBrandName() );
		}
		for (Color colors : colorService.getAll().getData()) {
			System.out.println(colors.getColorId() + " " +  colors.getColorName() );
		}
	}

}
