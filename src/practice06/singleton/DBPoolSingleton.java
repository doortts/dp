package practice06.singleton;

public class DBPoolSingleton {
	   private static DBPoolSingleton INSTANCE ;
	   private static int MAX_POOL_SIZE = 10;
	   private DBPoolSingleton(){
		   
	   }
	   public static DBPoolSingleton getInstance(){
		   if ( INSTANCE == null ){
			   INSTANCE = new DBPoolSingleton();   
		   }
		   return INSTANCE;
	   }
	   
	   public static String getConnection(){
		   if (MAX_POOL_SIZE > 0) MAX_POOL_SIZE--;
		   else System.out.println("No More connections!");
		   
		   System.out.println("pooling remains : " + MAX_POOL_SIZE);
		   return "connected..";
	   }
	   
	   public static String releaseConnection(){
		   if (MAX_POOL_SIZE < 10) MAX_POOL_SIZE++;
		   else System.out.println("Noting to release!");
		   
		   System.out.println("pooling remains : " + MAX_POOL_SIZE);
		   return "released..";
	   }
}
