package business.abstracts;

import java.util.List;

import core.utilities.results.DataResult;
import core.utilities.results.Result;
import entities.concretes.Car;

public interface CarService {
	DataResult<List<Car>> getAll();
	Result add(Car car);
	Result remove(int carId);
	Result update(int carId, Car car);
	Car getById(int carId);
}
