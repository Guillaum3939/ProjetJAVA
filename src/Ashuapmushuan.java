
public class Ashuapmushuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OrignalExperimental alice = new OrignalExperimental();
		OrignalExperimental bob = new OrignalExperimental();
		OrignalExperimental marvin = new OrignalExperimental();
		OrignalExperimental nantucket = new OrignalExperimental();
		
		alice .setnom("Alice");
		bob .setnom("Bob");
		marvin .setnom("Marvin");
		nantucket .setnom("Nantruck");
		
		System.out.println(">>> Voici les détails des orignaux <<<");
        alice.afficherDetails();
        System.out.println();
        bob.afficherDetails();
        System.out.println();
        marvin.afficherDetails();
        System.out.println();
        nantucket.afficherDetails();
        
        System.out.println("\n\n");
        System.out.println(">>> Quelques jours plus tard... <<<");
        injecterModificateurDeGenes(marvin);
        alice.afficherDetails();
        System.out.println();
        bob.afficherDetails();
        System.out.println();
        marvin.afficherDetails();
        System.out.println();
        nantucket.afficherDetails();
	}
	
}

public static void injecterModificateurDeGenes(OrignalExperimental orignal) {
    OrignalExperimental.setEstRadioactif(true);
    System.out.println("L'orignal infecté est : " + orignal.getNom());
    
    Random rand = new Random();
    int minValue = 1;
    int maxValue = 3 + 1;
    int nombreAleatoire = rand.nextInt(maxValue - minValue) + minValue;
    orignal.setNombreDeTetes(nombreAleatoire);
    
    minValue = 0;
    maxValue = 4 + 1;
    nombreAleatoire = rand.nextInt(maxValue - minValue) + minValue;
    orignal.setNombreDeYeux(nombreAleatoire);
    
    minValue = 2;
    maxValue = 8 + 1;
    nombreAleatoire = rand.nextInt(maxValue - minValue) + minValue;
    orignal.setNombreDePattes(nombreAleatoire);
    
    minValue = 0;
    maxValue = 1 + 1;
    nombreAleatoire = rand.nextInt(maxValue - minValue) + minValue;
    boolean siModif = nombreAleatoire != 0;
    orignal.setEstDemoniaque(siModif);
}
}









