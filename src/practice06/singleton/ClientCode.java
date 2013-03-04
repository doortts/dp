package practice06.singleton;

public class ClientCode {
	public static void main(String[] args) {
		DBPoolSingleton dbpool = DBPoolSingleton.getInstance();

		for (int i = 0; i < 12 ; i++) {
			System.out.println( dbpool.getConnection() );
		}

		for (int i = 0; i < 12 ; i++) {
			System.out.println( dbpool.releaseConnection() );
		}
	}
	

}
