package business.abstracts;

import java.util.List;

import core.utilities.results.DataResult;
import core.utilities.results.Result;
import entities.concretes.Color;

public interface ColorService {
	DataResult<List<Color>> getAll();
	Result add(Color color);
}