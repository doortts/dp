package practice07.singleton;

public class SingletonJava5 {
	private static volatile SingletonJava5 INSTANCE;

	protected SingletonJava5() {
	}

	public static SingletonJava5 getInstance() {
		if (INSTANCE == null)
			synchronized (SingletonJava5.class) {
				if (INSTANCE == null)
					INSTANCE = new SingletonJava5();
			}

		return INSTANCE;
	}
}
