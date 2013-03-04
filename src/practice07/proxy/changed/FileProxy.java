package practice07.proxy.changed;

public class FileProxy implements IFile {
	IFile file;
	private String name;
	
	public FileProxy(String name) {
		this.name = name;
	}
	
	public void read() {
		if(this.file == null )
			this.file = new File(this.name);
		this.file.read();
	}

}
