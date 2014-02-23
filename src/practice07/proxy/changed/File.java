package practice07.proxy.changed;

public class File implements IFile {

	private String name;
	public File(String name) {
		this.name = name;
		initialize();
	}
	
	private void initialize(){
		System.out.println(this.name + " initializing...");
		for(int i=0; i<5; i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(".");
		}
		System.out.println("completed");
	}
	
	@Override
	public void read(){
		System.out.println(">>>>> Contents read from " + this.name);
	}
}
