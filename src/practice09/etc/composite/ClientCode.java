package practice09.etc.composite;

public class ClientCode {

	public static void main(String[] args) {
		System.out.println("Making root entries...");

		// 생성부
		Entry rootdir = new Directory("root");
		Entry bindir = new Directory("bin");
		Entry tmpdir = new Directory("tmp");
		Entry usrdir = new Directory("usr");

		rootdir.add(bindir);
		rootdir.add(tmpdir);
		rootdir.add(usrdir);

		bindir.add(new File("vi", 10000));
		bindir.add(new File("latex", 20000));

		Entry apache = new Directory("apache");

		usrdir.add(apache);

		Entry confFile = new File("httpd.conf", 100);
		Entry apachectlFile = new File("apachectl", 200);
		apache.add(confFile);
		apache.add(apachectlFile);

		// 사용부
//		System.out.println("== from root dir==");
//		rootdir.printList();
//		System.out.println("== from usr dir==");
//		usrdir.printList();
		System.out.println("== from httpd.conf file ==");
		confFile.printList();
	}

}
