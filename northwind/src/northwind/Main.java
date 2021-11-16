package northwind;

import northwind.business.abstracts.CategoryService;
import northwind.business.abstracts.ProductService;
import northwind.business.concretes.CategoryManager;
import northwind.business.concretes.ProductManager;
import northwind.dataAccess.concretes.CategoryDao;
import northwind.dataAccess.concretes.ProductDao;
import northwind.entities.concretes.Category;
import northwind.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {

		ProductService productService = new ProductManager(new ProductDao());
		productService.add(new Product(1, 1, "Elma", 10));
		productService.add(new Product(2, 1, "Armut", 20));
		productService.add(new Product(3, 1, "Karpuz", 30));
		productService.add(new Product(4, 1, "Üzüm", 40));
		productService.add(new Product(5, 1, "İncir", 50));
		productService.add(new Product(6, 1, "Elma", 40));
		productService.add(new Product(7, 2, "Muz", -40));
		productService.add(new Product(8, 3, "Kavun", 5));

		for (Product product : productService.getAll()) {

			System.out.println(product.getProductName());
		}

		CategoryService categoryService = new CategoryManager(new CategoryDao());
		categoryService.add(new Category(1, "Meyve"));
		categoryService.add(new Category(2, "Sebze"));
		categoryService.add(new Category(3, "İçecek"));

		for (Category category : categoryService.getAll()) {
			System.out.println(category.getCategoryName());
		}

	}

}

// IoC container