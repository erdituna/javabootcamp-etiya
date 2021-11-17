package business.abstracts;

import java.util.List;

import core.utilities.results.DataResult;
import core.utilities.results.Result;
import entities.concretes.Brand;

public interface BrandService {
	DataResult<List<Brand>> getAll();
	Result add(Brand brand);
}