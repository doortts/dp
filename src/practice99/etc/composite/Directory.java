package practice99.etc.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Directory
class Directory extends Entry {
	private String name;
	private List<Entry> directory = new ArrayList<Entry>();

	public Directory(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		int size = 0;

		Iterator<Entry> iterator = directory.iterator();
		while (iterator.hasNext()) {
			Entry entry = (Entry) iterator.next();
			size += entry.getSize();
		}

		return size;
	}

	public void printList() {
		System.out.println("/" + this);

		Iterator<Entry> iterator = directory.iterator();
		while (iterator.hasNext()) {
			Entry entry = (Entry) iterator.next();
			entry.printList();
		}
	}

	public void add(Entry entry) {
		directory.add(entry);
	}

	public void remove(Entry entry) {
		directory.remove(entry);
	}
}