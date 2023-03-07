package histoire;

import personnages.*;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asteri", 8);
		Romain minus = new Romain("Minus", 6);
		
		asterix.parler("Bonjour a tous");
		minus.parler("UN GAU... ARGH");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	}
}
