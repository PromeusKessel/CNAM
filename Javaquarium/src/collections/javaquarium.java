package collections;

import java.util.Scanner;

/**
 * @author promeus kessel
 *
 */
public class javaquarium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inputString;
		String aquaName;
		char inputChar; 
		int i = 0;
		int inputInt = 0;
		Poissons fish = null;
		System.out.println("Bonjour. Bienvenue dans le Javaquarium de 24. \nNous sommes le 16.08.2016");
		
		do {
			i++; // Pour compter les tours
			System.out.println("Tour n°"+i);
			System.out.println("Nombre de poissons :" + fish.nbreInstances);
			
			System.out.println("Voulez vous ajouter des poissons ? (O/N)");
			inputChar = sc.nextLine().charAt(0);
			if(inputChar == 'O') 
			{
				System.out.println("Combien de poissons voulez vous ajouter ?");
				inputInt = sc.nextInt();
				for(i=0;i<inputInt;i++) {
					String fishName;
					String fishType; 
					System.out.println("Quel est le nom du poisson ?");
					fishName = sc.nextLine();
					System.out.println("Quel est le type du poisson ?");
					fishType = sc.nextLine();
					new Poissons(fishName, fishType);
				}
			}
			

			
			do {
				System.out.println("Voulez vous passer au tour suivant ? (O/N)");
				inputChar = sc.nextLine().charAt(0);
			}while (inputChar != 'O' && inputChar != 'N');
		}while (inputChar == 'O');
		
		System.out.println("Au revoir");
	}


	

	

}