package personnages;
import java.util.Random;

public class Druide{
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int preparerPotion = 1;
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
		+ effetPotionMax + ".");
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "«" + texte + "»");
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	public void preparePotion(){
		Random random = new Random();
		int res;
		res = random.nextInt(effetPotionMin, effetPotionMax);
		if (res > 7) {
			this.parler("J'ai préparé une super potion de force " + res);
			
		} else {
			this.parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + res);
		}
	}
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.preparePotion();
	}
}
