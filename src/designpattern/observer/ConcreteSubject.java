package designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
	private double tmp, press;

	// liste mit observern! ist somit eine asso mit kardinalität n!
	private List<Observer> observers;

	public ConcreteSubject() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		if (!this.observers.contains(o)) {
			this.observers.add(o);
		}

	}

	@Override
	public void removeObserver(Observer o) {
		this.observers.remove(o);

	}

	/**
	 * Hier muss einfach für jeden Observer die updatemethode aufgerufen werden.
	 * das wird von der subjektklasse gemacht!
	 */
	@Override
	public void notifyObservers() {
		for (Observer o : this.observers) {
			o.update(tmp, press);
		}

	}

	public void setWerte(double tmp, double press) {
		this.tmp = tmp;
		this.press = press;

		// wenn was geändert dann informiere alle observer

		valuesChanged();
	}

	private void valuesChanged() {
		notifyObservers();

	}

}
