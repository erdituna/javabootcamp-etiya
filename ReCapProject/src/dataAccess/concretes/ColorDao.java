package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.ColorRepository;
import entities.concretes.Color;

public class ColorDao implements ColorRepository {
	
	List<Color> colors;
	

	public ColorDao() {
		super();
		colors = new ArrayList<Color>();
	}

	@Override
	public void insert(Color color) {
		colors.add(color);
	}

	@Override
	public Color getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Color> getAll() {
		// TODO Auto-generated method stub
		return colors;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int id, Color entity) {
		// TODO Auto-generated method stub
		
	}

}