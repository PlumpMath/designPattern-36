package designpattern.template.method;

public class Tee extends KoffeinhaltigesGetraenk {

	@Override
	public void zutatenHinzufügen() {
		System.out.println("Fuege Zitrone hinzu...");

	}

	@Override
	public void aufgießen() {
		System.out.println("Lasse Tee ziehen..");

	}

}
