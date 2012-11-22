package runner;

import designpattern.template.method.Kaffe;
import designpattern.template.method.Tee;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// OBSERVER PATTERN
		/*
		 * zu beobachtenden subjekte
		 */
		// ConcreteSubject station1 = new ConcreteSubject();
		// ConcreteSubject station2 = new ConcreteSubject();
		//
		// /*
		// * ein observer für beide
		// */
		// ConcreteObserver obs1= new ConcreteObserver(station1);
		// ConcreteObserver obs2= new ConcreteObserver(station1);
		// ConcreteObserver obs3= new ConcreteObserver(station1);
		// //regestrieren
		//
		//
		// station1.setWerte(10.5, 200.1);
		// station2.setWerte(1123.1, 254.1);

		/*
		 * TEMPLATE METHOD PATTERN
		 */
		Kaffe kaffe = new Kaffe();
		Tee tee = new Tee();

		// zubereitung
		kaffe.zubereitungsRezept();
		System.out.println("\n");
		tee.zubereitungsRezept();

	}

}
