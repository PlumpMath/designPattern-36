package designpattern.observer;

/**
 * Der Observer (Beobachter, Listener, engl. observer pattern) ist ein
 * Entwurfsmuster aus dem Bereich der Softwareentwicklung und geh�rt zu der
 * Kategorie der Verhaltensmuster (behavioural patterns). Es dient zur
 * Weitergabe von �nderungen an einem Objekt an von diesem Objekt abh�ngige
 * Strukturen.[1] Das Muster ist eines der sogenannten GoF-Muster (Gang of Four;
 * siehe Viererbande). <h3>Wetterstation Bsp<h3>
 * Wir modellieren die Wetterstation vom Head first Buch nach. </br> Dabei gibts
 * es einen beobachter der die verschiednen anzeigen der Wetterstation
 * beobachtet und von diesen immer wieder upgedated wird.
 * 
 * @author reemstar
 * 
 */
public interface Observer {
	 

	void update(double d, double e);

}
