package personnages;

public class Personnage {
	private String nom;
	private int force;
	public Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "«" + texte + "»");
	}
	protected String prendreParole() {
		return  nom + " : ";
	}

	@Override
	public String toString() {
		return "[nom=" + nom + ", force=" + force + "]";
	}
	
}

