package collections;

import java.util.Scanner;

/**
 * @author promeus kessel
 * TODO : Class abstract Creature qui gere age + isAlive
 *  Poissons et algues extends creature méauh
 * Poissons Carnivores extends poissons
 * Poissons (nom sexe race régime)
 */
public class javaquarium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inputString;
		char inputChar; 
		int i = 0;
		int inputInt = 0;
		int addFish = 0;
		int addAlgues = 0;

		System.out.println("-- Début de la simulation");
		System.out.println("Bonjour. Bienvenue dans le Javaquarium de 24. \nNous sommes le 16.08.2016");
		// EXO 1 : AJOUTER DES POISSONS ET DES ALGUES
	 
		do {
			i++; // Pour compter les tours
			System.out.println("Tour n°"+i);
			System.out.println("Nombre d'algues : " + algues.nbreInstances);
			System.out.println("Nombre de poissons : " + Poissons.nbreInstances);
			System.out.println("Liste des poissons  :");
			System.out.print("\t Poissons n°");
			
			/**
			 * 
			 *  ICI
			 *  
			 * 
			 */
			for(int k = 0; k < Poissons.fishList.
			
			do {
				System.out.println("\n**************************************");
				System.out.println("* Que voulez-vous faire ?            *");
				System.out.println("*\t1 : Ajouter des poissons.    *");
				System.out.println("*\t2 : Ajouter des algues.      *");
				System.out.println("*\t9 : Quitter la simulation.   *");
				System.out.println("**************************************");
				System.out.print("Choix : ");
				inputInt = sc.nextInt();
				sc.nextLine();
			}while (inputInt != 1 && inputInt != 2 && inputInt != 9);
			
			switch (inputInt) 
			{
			case 1:
				System.out.println("-- Génération de poissons");
				System.out.println("Combien de poissons voulez-vous ajouter ?");
				addFish = sc.nextInt();
				sc.nextLine();
				for(int j = 0; j < addFish; j++) 
				{
					String fishName = " ";
					String fishType = " ";
					String fishRegime = " ";
					System.out.println("Quel est le nom du poisson n°"+j);
					fishName = sc.nextLine(); 
					System.out.println("Est-ce un male (1) ou une femelle (2) ?");
					inputInt = sc.nextInt();
					sc.nextLine();
					if (inputInt == 1) 
						fishType = "male";
						else fishType = "femelle";

					System.out.println("De quelle race est-il ?");
					System.out.println("1 : Mérou\n2 : Thon\n3 : Poisson-Clown\n4 : Sole\n4 : Bar\n5 : Bar\n6 : Carpe");
					inputInt = sc.nextInt();
					sc.nextLine();
					switch (inputInt)
					{
					case 1:
						new PoissonsCarni(fishName, fishType, "Mérou");
						break;
					case 2:
						break;
					case 3: 
						break;
					case 4:
						break;
					case 5: 
						break;
					case 6:
						break;
					}
				}
				
				break;
			case 2:
				System.out.println("-- Génération d'algues");
				System.out.println("Combien d'algues voulez-vous ajouter ?");
				addFish = sc.nextInt();
				sc.nextLine();
				for(int j = 0; j < addAlgues; j++) 
				{
					new algues();
				}
				break;
			case 9 :
				inputChar = 'n';
				break;
			
			}
			
			/**
					new Poissons(fishName, fishType);

			**/
			

			
			do {
				System.out.println("\nVoulez vous passer au tour suivant ? (O/N)");
				inputChar = sc.nextLine().charAt(0);
			}while (inputChar != 'O' && inputChar != 'N' && inputChar != 'o' && inputChar != 'n');
		}while (inputChar == 'O' || inputChar == 'o');
		
		System.out.println("-- Fin de la simulation");
	}
}