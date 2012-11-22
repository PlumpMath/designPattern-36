package designpattern.observer;

/**
 * 
 * @author reemstar
 * 
 */
public class ConcreteObserver implements Observer {
	//dadurch wird auch die kardinalität auf 1 (subject) begrenzt´
	private ConcreteSubject subject;

	/**
	 * im konstruktor findet die eigentliche regestistrierung statt
	 * 
	 * @param subject
	 */
	public ConcreteObserver(ConcreteSubject subject) {
		this.subject = subject;
		this.subject.registerObserver(this);
	}

	@Override
	public void update(double d, double e) {
		System.out.println("Updated:\n" + e + " " + d);
	}

}
