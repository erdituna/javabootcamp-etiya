package business.concretes;

import java.util.List;

import business.abstracts.CarService;
import core.utilities.results.DataResult;
import core.utilities.results.Result;
import core.utilities.results.SuccessDataResult;
import core.utilities.results.SuccessResult;
import dataAccess.abstracts.CarRepository;
import entities.concretes.Car;

public class CarManager implements CarService{

	private CarRepository carRepository;
	
	
	public CarManager(CarRepository carRepository) {
		super();
		this.carRepository = carRepository;
	}

	@Override
	public DataResult<List<Car>> getAll() {
		
		return new SuccessDataResult<List<Car>>(this.carRepository.getAll());
	}

	@Override
	public Result add(Car car) {
		this.carRepository.insert(car);
		return new SuccessResult("Araç eklendi.");
	}

	@Override
	public Result remove(int carId) {
		this.carRepository.delete(carId-1);
		return new SuccessResult("Araç silindi.");
	}

	@Override
	public Result update(int carId, Car car) {
		this.carRepository.update(carId-1, car);
		return new SuccessResult("Araç güncellendi");
	}

	@Override
	public Car getById(int carId) {
		return carRepository.getById(carId);
	}

}