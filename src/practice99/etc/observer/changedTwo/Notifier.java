package practice99.etc.observer.changedTwo;

import java.util.ArrayList;
import java.util.List;

public abstract class Notifier {
	List<Observer> observers = new ArrayList<Observer>();
	
	public void addObserver(Observer ro){
		this.observers.add(ro);
	}
	
	public void removeObserver(Observer ro){
		this.observers.remove(ro);
	}
	
	public void updatePollingTime(){
		for (Observer observer : observers) {
			observer.update();
		}
	}
	
	public void immediateOut(){
		for (Observer observer : observers) {
			observer.out();
		}
	}
}
