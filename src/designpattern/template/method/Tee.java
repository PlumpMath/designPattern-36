package designpattern.template.method;

public class Tee extends KoffeinhaltigesGetraenk {

	@Override
	public void zutatenHinzuf�gen() {
		System.out.println("Fuege Zitrone hinzu...");

	}

	@Override
	public void aufgie�en() {
		System.out.println("Lasse Tee ziehen..");

	}

}
