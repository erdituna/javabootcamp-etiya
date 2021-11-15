package interface3;

public class Utils {

	public void RunLoggers(Logger[] loggers) {
		for (Logger logger : loggers) {
			logger.log();
		}
	}
	
}
