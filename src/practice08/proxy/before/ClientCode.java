package practice08.proxy.before;

public class ClientCode {

	/**
	 * 작업에 필요한 리소스 파일들 읽어들이기 
	 */
	public static void main(String[] args) {
		// 초기 파일
		File remoteFile = new File("DefaultInfo.xml");
		// 사용할 파일이 변경됨
		remoteFile = new File("ServerInfo.xml");
		// 사용할 파일이 변경됨
		remoteFile = new File("BizInfo.xml");
		
		System.out.println("some biz work... and it is needed for files");
		remoteFile.read();
	}

}
