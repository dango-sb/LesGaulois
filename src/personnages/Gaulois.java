package personnages;

public class Gaulois extends Personnage {
	private String nom;
	private int force;
	private int effetPotion;
	public Gaulois(String nom, int force, int effetPotion) {
		super(nom, force);
		this.effetPotion = effetPotion;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "«" + texte + "»");
	}
	protected String prendreParole() {
		String parole = super.prendreParole();
		return "Le gaulois " + parole;
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom()); romain.recevoirCoup((force * effetPotion) / 3);
	}

	@Override
	public String toString() {
		String etatPersonnage = super.toString();
		return "Gaulois" + etatPersonnage;
	}
	
	public void boirePotion(int potion) {
		this.effetPotion = potion;
		this.parler("Merci Druide, je sens que ma force est " + this.effetPotion + " fois décuplée");
		
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 5, 1);
		Romain mark = new Romain("Mark", 2);
		System.out.println(asterix);
		asterix.frapper(mark);
		asterix.parler("Ha-ha!");
		asterix.boirePotion(5);
		System.out.println(asterix.effetPotion);
	}
}