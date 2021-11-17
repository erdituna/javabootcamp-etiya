package business.concretes;

import java.util.List;

import business.abstracts.BrandService;
import core.utilities.results.DataResult;
import core.utilities.results.Result;
import core.utilities.results.SuccessDataResult;
import core.utilities.results.SuccessResult;
import dataAccess.abstracts.BrandRepository;
import entities.concretes.Brand;

public class BrandManager implements BrandService{
	
	private BrandRepository brandRepository;
	

	public BrandManager(BrandRepository brandRepository) {
		super();
		this.brandRepository = brandRepository;
	}

	@Override
	public DataResult<List<Brand>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Brand>>(this.brandRepository.getAll());
	}

	@Override
	public Result add(Brand brand) {
		this.brandRepository.insert(brand);
		return new SuccessResult("Marka eklendi.");
	}

}