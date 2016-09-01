public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int jj=1, mm=1, aaaa=1;
			boolean DateOK = false;
			String month = "waht"; 
			char sortie = 'n';
			// ask for date

			
			do {
				// GESTIONS DES ENTREES
				Terminal.ecrireStringln("Indiquez un jour (jj) : ");
				jj = Terminal.lireInt();
				
				Terminal.ecrireStringln("Indiquez un mois (mm) : ");
				mm = Terminal.lireInt();
				
				Terminal.ecrireStringln("Indiquez une année (a) :");
				aaaa = Terminal.lireInt();
				
				if (jj<1) { 
					Terminal.ecrireStringln("Erreur : le jour doit être une valeur positive");
					DateOK = false;
				}
				if (mm<1) { 
					Terminal.ecrireStringln("Erreur : le mois doit être une valeur positive");
					DateOK = false;
				}
				else if (mm>12) {
					Terminal.ecrireStringln("Erreur : le mois doit être inférieur ou égal à 12");
					DateOK = false; 
				}
				else if (aaaa < 1) {
					Terminal.ecrireString("Erreur : l'année doit être une valeur positive" );
					DateOK = false; 
				}
				
				// ALPHABETISATION DU MOIS
				switch (mm) {
				case 1: month = "janvier";
						break;
				case 2: month = "février";
						break;
				case 3: month = "mars";
						break;
				case 4: month = "avril";
						break;
				case 5: month = "mai";
						break;
				case 6: month = "juin";
						break;
				case 7: month = "juillet";
						break;
				case 8: month = "aout";
						break;
				case 9: month = "septembre";
						break;
				case 10: month = "octobre";
						break;
				case 11: month = "novembre";
						break;
				case 12: month = "décembre non mais sérieusement quoi";
						break;
				default:
					break;
				}
				
				// GESTION DU MOIS DE FEVRIER 
				if (mm==02) {
					Terminal.ecrireStringln("C'est le mois de février");
					if ((aaaa % 4 == 0) && (aaaa % 100 != 0) && (aaaa % 400 == 0)) {
						Terminal.ecrireStringln("L'année est bissextile !");
					} else { Terminal.ecrireStringln("L'année n'est pas bissextile.");	}
				}
				// DERNIER CAS PARTICULIER :) 
				if (jj == 11 && mm == 02) {
					int anDeGrace = 1989;
					int age = 0;
					Terminal.ecrireStringln("C'est l'anniversaire du créateur de ce code ! :-)");
					// Afficher l'age ?
					age = anDeGrace - aaaa;
					Terminal.ecrireStringln("Il a "+age+" ans.");
				}
				// AFFICHAGE DE LA DATE
				if (DateOK == true) {
					Terminal.ecrireStringln("La date vérifiée est le "+jj+" "+month+" "+aaaa);
				}
				
				// FIN DE LA BOUCLE ?
				//if (DateOK == true) {
					Terminal.ecrireString("Souhaitez vous vérifier une autre date ? (O/N)");
					sortie = Terminal.lireChar();
					if (sortie == 'o' | sortie == 'O') { DateOK = true; }
					else { DateOK = false; }
				//}
			} while (DateOK == true);
	}

}
