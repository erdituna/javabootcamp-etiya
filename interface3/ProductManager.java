package interface3;

public class ProductManager implements ProductService{

	private Logger[] loggers;
	
	public ProductManager(Logger[] loggers) {
		super();
		this.loggers = loggers;
	}

	@Override
	public void save(Product products) {
		// TODO Auto-generated method stub
		Utils utils = new Utils();
		utils.RunLoggers(loggers);
	
	}

}
