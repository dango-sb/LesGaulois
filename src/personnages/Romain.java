package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement = 0;
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "«" + texte + "»");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
	}
	
	public void sEquiper(Equipement equipement_to_add){
		if (nbEquipement==2) {
			System.out.println("Le soldat" + nom + "est déjà bien protégé !");
		}
		else {
			for (Equipement equipement: equipements) {
				if (equipement_to_add == equipement) {
					System.out.println("Le soldat" + nom + "possède déjà un" + equipement.getNom());
				}
				else {}
			}
		}
		
	}
}