package designpattern.template.method;

/**
 * Das hier vorgestellt Muster wird vor allem eingesetzt um Teile von
 * Algorithmen zu kapseln. Sodass sich Unterklassen dann jeder Zeit in eine
 * Berechnung ein kapseln k�nnen.
 * 
 * @author reemstar
 * 
 */
public class Kaffe extends KoffeinhaltigesGetraenk {

	@Override
	public
	void zutatenHinzuf�gen() {
		System.out.println("Fuege Milche und Zucker hinzu...");

	}

	@Override
	public
	void aufgie�en() {
		System.out.println("Lasse Kaffe mal durch Filter durch!");

	}

}
