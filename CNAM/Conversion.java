
public class Conversion {
	public static void main(String[] args) {
		
		// Programme de date correcte
		// Saisir une date au format jj / mm / aaaa
		// Vérifier si la date est correcte
		// Sinon : indiquer l'erreur
		// Donner : 
		//   Annee bissextile
		//   Nb de jour du mois en cours
		
		int jj, mm, aaaa;
		String month; 
		boolean dateOK = true;
		
		// vérifier que aucun < 0
		// vérifier mm 
			// si 02 -> alors vérifier si bissex + vérifier si 0 < jj =< 29
			// si 04 06 09 11 vérifier si 0 < jj =< 30
			// si 01 03 05 07 08 10 12, vérifier si 0 < jj =< 31 
		
		Terminal.ecrireString("Vérification de la date");
		Terminal.ecrireStringln("***********************");

		Terminal.ecrireString("Indiquez un jour ; jj = ");
		jj = Terminal.lireInt();
		
		Terminal.ecrireString("Indiquez un mois ; mm = ");
		mm = Terminal.lireInt();

		Terminal.ecrireString("Indiquez une année ; aaaa = ");
		aaaa = Terminal.lireInt();
		

		
		do {
			if (jj<1||jj>31) { 
				dateOK = false;
				Terminal.ecrireString("Erreur sur les jours"); 
			}
			else if (mm<1 || mm>12) { 
				dateOK = false;
				Terminal.ecrireString("Erreur sur les mois"); 
			}
			else if (aaaa<0) { 
				dateOK = false;
				Terminal.ecrireString("Erreur sur l'année"); 
			}
			else { dateOK = true; }
			
			if (mm==2) {
				if ((aaaa % 4 == 0) | !(aaaa % 100 == 0) | (aaaa % 400 == 0)) { Terminal.ecrireString("Année bissextile"); }
				else { Terminal.ecrireString("Année non bissextile"); }
			}
			if (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) {
				Terminal.ecrireString("Mois en 31 jours");
			}
			if (mm == 4 || mm == 6 || mm == 9 || mm == 11) {
				Terminal.ecrireString("Mois en 30 jours");
			}
		}while (dateOK = true);
		
		
		/**(mm == 02) { 
			Terminal.ecrireString("Février");
			if ( mm == 02 ) { // Vérifier si bissext
				Terminal.ecrireString("Février");
			}
			else { } // Si pas bissext alors vérifier si jj < 28
		}
		else if (mm == 01 || mm == 03 || mm == 05 || mm == 07 || mm == 8 || mm == 10 || mm == 12) {
			Terminal.ecrireString("Mois en 31 jours");
		}
		else { Terminal.ecrireString("Mois en 30 jours"); }
		// Terminal.ecrireString("Date indiquée : "+jj+"/"+mm+"/"+aaaa);
		
		/**double dollar, somme, euros;
		char exit = 'o';
		
		
		// modifier ce programme pour pouvoir convertir plusieurs sommes + prvoir moyen de stopper l'execution
		// do ... while (char isnot stop)
		
		Terminal.ecrireStringln("Système de conversion");
		Terminal.ecrireStringln("*********************");
		Terminal.ecrireString("\tCours du dollar :");
		dollar = Terminal.lireDouble();
		// Un dollar vaut 0.89 € 
		
		do {
			Terminal.ecrireString("\tSomme à convertir en euros :");
			somme = Terminal.lireDouble();
			
			if (dollar<1) {euros = somme * dollar;}
			else {euros = somme / dollar;}
			
			Terminal.ecrireStringln("$"+somme+" vaut "+euros+"€.");
			
			Terminal.ecrireString("Souhaitez vous faire une autre conversion ? (O/N)");
			exit = Terminal.lireChar(); 
			
			while (exit != 'N' && exit != 'O') {
				System.out.println("Merci d'indiquer O ou N");
				Terminal.ecrireString("Souhaitez vous faire une autre conversion ? (O/N)");
				exit = Terminal.lireChar(); 
			} 

		}while (exit == 'O');
		
		/**for (int i = 1; i < 11; i++) {
			Terminal.ecrireStringln("Pour x = "+i+", x² = "+i*i);
		}
		
		int x, y;
		Terminal.ecrireString("Quelle valeur de x ? :");
		x = Terminal.lireInt();
		Terminal.ecrireString("Quelle valeur de y ? :");
		y = Terminal.lireInt();
		int x1 = 1;
		for (int i=0; i < y ;i++) {
			x1 = x1 * x;
			Terminal.ecrireStringln(" " + x + "^"+ i + " = " + x1);
		}
		
		/** double euros, francs;
		Terminal.ecrireString("Somme en euros ? :");
		euros = Terminal.lireDouble();
		francs = euros*6.55957;
		Terminal.ecrireStringln(euros + "F vaut " + francs + "€.");
		
		Terminal.ecrireStringln("Exo 2.2.2");
		
		// nf note finale
		// ne note exam
		// np note partiel
		
		int ne, np;
		double nf;
		
		Terminal.ecrireStringln("Quelle note d'examen ? :");
		ne = Terminal.lireInt();
		
		Terminal.ecrireStringln("Quelle note de partiel ?");
		np = Terminal.lireInt();
		
		// Calcul de la moyenne
		nf = (ne + np)/2;
		if (nf < 7) { 
			Terminal.ecrireStringln("Vous êtes éliminé");
		}
		else if (nf > ne) {
			Terminal.ecrireStringln("Moyenne : " + nf);
		}
		else {Terminal.ecrireStringln("Moyenne : " + ne + "(exam. seulement)");}
		
		int a, b, c;
		boolean ordre = true;
		
		Terminal.ecrireString("a = ");
		a = Terminal.lireInt();
		Terminal.ecrireString("b = ");
		b = Terminal.lireInt();
		Terminal.ecrireString("c = ");
		c = Terminal.lireInt();
		
		if (a < b & b < c & a < c) { // SI A EST INFERIEUR A B ET B INFERIEUR A A ALORS A EST FORCEMENT INFERIEUR A C 
			ordre = true; 
		}
		else if  (a > b & b > c & a < c) {
			ordre = true;
		}
		else ordre = false;
		
		Terminal.ecrireBoolean(ordre);
		
		int a, b, c, z;
		
		Terminal.ecrireString("a = ");
		a = Terminal.lireInt();
		Terminal.ecrireString("b = ");
		b = Terminal.lireInt();
		Terminal.ecrireString("c = ");
		c = Terminal.lireInt();
		
		if (c > a & c > b) { z = c; }
		else if (a > c & a > b) { z = a; }
		else { z = b; }
		
		Terminal.ecrireStringln("Entier le plus grand : "+z);
		
		Terminal.ecrireStringln("exo 2.2.4");
		int a = 0;
		
		Terminal.ecrireString("a = ");
		a = Terminal.lireInt();
		
		Terminal.ecrireString("L'entier a est ");
		if (a>=0) { Terminal.ecrireString("positif"); }
		else { Terminal.ecrireString("négatif"); }
		}
		
		int a = 0, b = 0;
		Terminal.ecrireString("Combien de lignes supp? : ");
		a = Terminal.lireInt();
		b = a - 2;
		if (b<0) {b= 1;}
		Terminal.ecrireStringln("******");
		for (int i = 0; i < b;i=i+1) {
			Terminal.ecrireStringln("*    *");	
		}
		Terminal.ecrireString("******");**/
		/**
		double a = 0;
		double k = 0;
		int x = 0;
		Terminal.ecrireStringln("Moyenne des x premiers entiers : ");
		x = Terminal.lireInt();
		for (int i = 1; i < x;i=i+1) {
			a = a + i;
		}
		k = a / x;
		Terminal.ecrireDoubleln(k);
		
		boolean repTest = false;
		int t = 0;
		while (repTest == false) {
			Terminal.ecrireStringln("Moyenne des x premiers entiers : ");
			t = Terminal.lireInt();
			if (t==0||t==1) { repTest = true; } else { repTest = false; }
		}/** **/
		
	}
}
