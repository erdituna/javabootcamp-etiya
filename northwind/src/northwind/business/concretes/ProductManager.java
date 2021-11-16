package northwind.business.concretes;

import java.util.List;

import northwind.business.abstracts.ProductService;
import northwind.dataAccess.abstracts.ProductRepository;
import northwind.entities.concretes.Product;

public class ProductManager implements ProductService {

	private ProductRepository productRepository;

	public ProductManager(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> getAll() {

		return this.productRepository.getAll();
	}

	@Override
	public void add(Product product) {
		if (productCheckIfExist(product) || categoryCount(product) || priceNotNegative(product) || priceEnough(product)) {
			System.out.println(product.getProductName() + " Ürünü eklenmedi " );
		} else
			this.productRepository.add(product);
		

	}

	@Override
	public boolean productCheckIfExist(Product product) {
		for (Product products : getAll()) {
			if (products.getProductName() == product.getProductName()) {
				return true;

			} else {
				return false;
			}

		}

		return false;

		// TODO Auto-generated method stub

	}

	@Override
	public boolean categoryCount(Product product) {
		int a =0;	
		for (Product products : getAll()) {
			if(products.getCategoryId() == product.getCategoryId())
				a++;
		
		}
		if(a>=5) {
			return true;
		}
		return false;
		
	}

	@Override
	public boolean priceNotNegative(Product product) {
		
		if(product.getUnitPrice()<0) {
			return true;
		}
		return false;
		
	}

	@Override
	public boolean priceEnough(Product product) {
		
		if(product.getCategoryId() == 3 && product.getUnitPrice() < 10) {
			return true;
		}
		return false;
	}

}
