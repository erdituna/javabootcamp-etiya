package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.CarRepository;
import entities.concretes.Car;

public class CarDao implements CarRepository {
	
	List<Car> cars;

	public CarDao() {
		super();
		cars = new ArrayList<Car>();
	}

	@Override
	public void insert(Car car) {
		cars.add(car);
		
	}

	@Override
	public void delete(int carId) {
		cars.remove(carId);
	}

	@Override
	public Car getById(int id) {

System.out.println(cars.get(id-1).getCarId() + " " + cars.get(id-1).getBrandId() + 
		" " + cars.get(id-1).getColorId() + " " + cars.get(id-1).getDailyPrice() + 
		" " + cars.get(id-1).getDescription() + " " + cars.get(id-1).getModelYear());
		return cars.get(id-1);
	}

	@Override
	public List<Car> getAll() {
		
		return cars;
	}

	@Override
	public void update(int id, Car entity) {
		cars.set(id, entity);
		
	}

}