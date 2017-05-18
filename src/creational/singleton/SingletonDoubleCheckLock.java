package creational.singleton;

public class SingletonDoubleCheckLock {

	private volatile static SingletonDoubleCheckLock instance;

	private SingletonDoubleCheckLock() {

	}

	public static synchronized SingletonDoubleCheckLock getInstance() {
		if (instance == null) {
			synchronized (SingletonDoubleCheckLock.class) {
				if (instance == null) {
					instance = new SingletonDoubleCheckLock();
				}
			}
		}
		return instance;
	}

}
