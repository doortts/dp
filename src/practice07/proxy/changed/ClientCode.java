package practice07.proxy.changed;

public class ClientCode {

	/**
	 * 작업에 필요한 리소스 파일들 읽어들이기 
	 */
	public static void main(String[] args) {
		// 초기 파일
		IFile remoteFile = getFile("DefaultInfo.xml");
		// 사용할 파일이 변경됨
		remoteFile = getFile("ServerInfo.xml");
		// 사용할 파일이 변경됨
		remoteFile = getFile("BizInfo.xml");
		
		System.out.println("some biz work... and it is needed for files");
		remoteFile.read();
	}

	private static FileProxy getFile(String fileName) {
		return new FileProxy(fileName);
	}

}
