
public class OrignalExperimental {
	private String nom;
	private int nombreDeTetes;
	private int nombreDeYeux;
	private int nombreDePattes;
	private static boolean estRadioactif;
	private boolean estDemoniaque;
	
	
	public void init() {
		 nombreDeTetes= 1;
		 nombreDeYeux= 2;
		 nombreDePattes= 4;
		 estRadioactif= false;
		 estDemoniaque= false;
	}
	
	public OrignalExperimental(){
		init();
	}
	
	
	public String getnom() {
		return nom;
	}
	public void setnom(String nom) {
		this.nom = nom;
	}
	
	public int getnombreDeTetes (){
		return nombreDeTetes;
	}
	public void setnombreDeTetes(int nombreDeTetes) {

		this.nombreDeTetes = nombreDeTetes;
	}
	
	public int getnombreDeYeux () {
		return nombreDeYeux;
	}
	public void setnombreDeYeux(int nombreDeYeux) {
		this.nombreDeYeux =nombreDeYeux;
	}
	
	public int getnombreDePattes () {
		return nombreDePattes;
	}
	public void setnombreDePattes(int nombreDePattes) {
		this.nombreDePattes =nombreDePattes;
	}
	
	public static boolean getestRadioactif() {
		return estRadioactif;
	}
	public static void setestRadioactif(boolean Radioactif) {
		estRadioactif = Radioactif;
	}
	
	public boolean getestDemoniaque() {
		return estDemoniaque;
	}
	public void setestDemoniaque(boolean estDemoniaque) {
		this.estDemoniaque =estDemoniaque;
	}
	
	public void afficherDetails() {
        System.out.println("Nom : " + this.nom);
        System.out.println("nombreDeTetes : " + this.nombreDeTetes);
        System.out.println("nombreDeYeux : " + this.nombreDeYeux);
        System.out.println("nombreDePattes : " + this.nombreDePattes);
        System.out.println("estRadioactif : " + this.estRadioactif);
        System.out.println("estDemoniaque : " + this.estDemoniaque);
    }
	
	
}

	