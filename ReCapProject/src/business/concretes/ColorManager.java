package business.concretes;

import java.util.List;

import business.abstracts.ColorService;
import core.utilities.results.DataResult;
import core.utilities.results.Result;
import core.utilities.results.SuccessDataResult;
import core.utilities.results.SuccessResult;
import dataAccess.abstracts.ColorRepository;
import entities.concretes.Color;

public class ColorManager implements ColorService {
	
	private ColorRepository colorRepository;
	

	public ColorManager(ColorRepository colorRepository) {
		super();
		this.colorRepository = colorRepository;
	}

	@Override
	public DataResult<List<Color>> getAll() {
		return new SuccessDataResult<List<Color>>(this.colorRepository.getAll());
	}

	@Override
	public Result add(Color color) {
		this.colorRepository.insert(color);
		return new SuccessResult("Renk eklendi.");
	}

}