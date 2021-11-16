package northwind.business.abstracts;

import java.util.ArrayList;
import java.util.List;

import northwind.dataAccess.abstracts.CategoryRepository;
import northwind.entities.concretes.Category;

public interface CategoryService {
    
    void add(Category category);
    List<Category> getAll();
   
}
