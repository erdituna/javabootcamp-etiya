package interface3;

public class DbLogger implements Logger{

	@Override
	public void log() {
		System.out.println("Db logged.");
		
	}

}
