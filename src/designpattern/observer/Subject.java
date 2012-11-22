package designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ndert sich der Zustand des Objektes, müssen die Komponenten darüber
 * informiert werden. Andererseits soll das Objekt aber von den Komponenten
 * unabhängig bleiben - ihre Schnittstelle also nicht kennen.
 * 
 * @author reemstar
 * 
 */
public interface Subject {

	// wennso, dann haben alle die gleichen observer! 
	//List<Observer> observers = new ArrayList<Observer>();

	void registerObserver(Observer o);

	void removeObserver(Observer o);

	void notifyObservers();

}
