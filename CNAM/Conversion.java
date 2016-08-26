
public class Conversion {
	public static void main(String[] args) {
		
		for (int i = 1; i < 11; i++) {
			Terminal.ecrireStringln("Pour x = "+i+", x² = "+i*i);
		}
		
		int x, y;
		Terminal.ecrireString("Quelle valeur de x ? :");
		x = Terminal.lireInt();
		Terminal.ecrireString("Quelle valeur de y ? :");
		y = Terminal.lireInt();
		int x1 = x;
		for (int i=0; i < y ;i++) {
			x = 1 * x1 * x;
			Terminal.ecrireStringln(" " + x1 + "^"+ i + " = " + x);
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
