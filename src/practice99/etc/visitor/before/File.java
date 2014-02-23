package practice99.etc.visitor.before;

//File
class File extends Entry {
	private String name;
	private int size;

	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	public void printList() {
		System.out.println(" " + this);
	}
}