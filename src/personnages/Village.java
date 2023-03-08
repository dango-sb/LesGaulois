package personnages;

public class Village {
	private Chef chef;
	private String nom;
	private int nbVillageois=0;
	private int nbVillageoisMaximum;
	private Gaulois[] villageois;
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	public void ajouterHabitant(Gaulois gaulois){
		if(nbVillageois!=nbVillageoisMaximum){
			villageois[nbVillageois]=gaulois;
			nbVillageois++;
		}
	}
	
	public Gaulois trouverHabitant(int place){
		return villageois[place];
	}
	
	public static void main(String[] args){
		Village village = new Village("Village des Irréductibles", 30);
		Chef abraracourcix = new Chef("Abraracourcix", 6, village);
		Gaulois asterix = new Gaulois("Asterix", 6);
		village.ajouterHabitant(asterix);
		Gaulois gaulois = village.trouverHabitant(1);
		System.out.println(gaulois);
		
	}
}
