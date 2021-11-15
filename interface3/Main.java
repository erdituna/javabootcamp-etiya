package interface3;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {new DbLogger(),new FileLogger()};
		ProductManager productmanager = new ProductManager(loggers);
		productmanager.save(null);
	}
}
