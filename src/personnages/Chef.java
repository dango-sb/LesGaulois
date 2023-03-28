package personnages;

public class Chef extends Gaulois {
	private String nom;
	private int force;
	private int effetPotion;
	private Village village;
	public Chef(String nom, int force, int effetPotion, Village village) {
		super(nom,force,effetPotion);
		this.village = village;
	}
	public String getNom() {
		return super.getNom();
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	protected String prendreParole() {
		return "Le chef " + nom + " du village " + village.getNom() + " : ";
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}
		
	public String toString() {
		String etatPersonnage = super.toString();
		return "Chef" + etatPersonnage;
	}
}
