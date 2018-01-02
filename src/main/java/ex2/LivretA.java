package ex2;

public class LivretA extends CompteBancaire {
	
	/** tauxRemuneration : taux de rÃ©munÃ©ration dans le cas d'un livret A 
	 *  miniLivretA : valeur minimale du solde du livret A. Il sera ici fixé à 0 
	 * */
	private double tauxRemuneration;
	private double miniLivretA = 0;
	
	public LivretA( double solde, double tauxRemuneration) {
		super("LA", solde, 0);
		this.tauxRemuneration = tauxRemuneration;
		
	}
	public void appliquerRemuAnnuelle(){
			this.solde = solde + solde*tauxRemuneration/100;
	}
	
	@Override
	public void debiterMontant(double montant){
		if (this.solde - montant > miniLivretA){
			this.solde = solde - montant;
		}
	}
	
	
	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */

	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
