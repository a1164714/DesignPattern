package singleton;

public class IodhSingleton {
	private IodhSingleton(){}
	private static class Iodh{
		private static final IodhSingleton instance = new IodhSingleton();
	}
	public static IodhSingleton getInstance(){
		return Iodh.instance;
	}
}
