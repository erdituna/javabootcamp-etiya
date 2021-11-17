package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.BrandRepository;
import entities.concretes.Brand;

public class BrandDao implements BrandRepository {
	
	List<Brand> brands;

	public BrandDao() {
		super();
		brands = new ArrayList<Brand>();
	}

	@Override
	public void insert(Brand brand) {
		
		brands.add(brand);
	}

	@Override
	public Brand getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Brand> getAll() {
		// TODO Auto-generated method stub
		return brands;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int id, Brand entity) {
		// TODO Auto-generated method stub
		
	}
}
