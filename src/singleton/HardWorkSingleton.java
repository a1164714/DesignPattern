package singleton;

public class HardWorkSingleton {
	private static final HardWorkSingleton instance = new HardWorkSingleton();
	private HardWorkSingleton(){}
	public static HardWorkSingleton getInstance(){
		return instance;
	}
}
