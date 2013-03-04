package practice99.etc.composite;

abstract class Entry {
	public abstract String getName();

	public abstract int getSize();

	public abstract void printList();

	public String toString() {
		return getName() + " (" + getSize() + ")";
	}

	public void add(Entry entry) {
		return; // 예외 처리나 null 처리
	}

	public void remove(Entry entry) {
		return; // 예외 처리나 null 처리
	}
}