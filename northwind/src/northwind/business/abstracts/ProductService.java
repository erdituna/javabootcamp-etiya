package northwind.business.abstracts;

import java.util.List;

import northwind.entities.concretes.Product;

public interface ProductService extends ProductCheckIfExist {
	List<Product> getAll();
	void add(Product product);
	boolean categoryCount(Product product);
	boolean priceNotNegative(Product product);
	boolean priceEnough(Product product);
	
}
