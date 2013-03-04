package practice09.etc.observer.changed;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Notifier {
	List<Observer> observers = new ArrayList<Observer>();
	
	public void addObserver(Observer ro){
		this.observers.add(ro);
	}
	
	public void removeObserver(Observer ro){
		this.observers.remove(ro);
	}
	
	public void updatePollingTime(int pollingTime){
		for (Observer observer : observers) {
			observer.update(pollingTime);
		}
	}
	
	public void immediateOut(){
		for (Observer observer : observers) {
			observer.out();
		}
	}
}
