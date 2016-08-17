package collections;

import java.util.ArrayList;

public abstract class Poissons {
	// Var
	protected String name;
	protected String sexe;
	protected String race;
	protected ArrayList<Object> fishList;
	
	// Gestion du nbr d'instances
	protected static int nbreInstances = 0; 
	
	// Constructeur
	public Poissons()
	{
		name = " ";
		sexe = " ";
		race = " ";
		nbreInstances++;
		
	}
	
	// Constructeur surchargé1
	public Poissons(String pName, String pSexe, String pRace)
	{
		this.name = pName;
		this.sexe = pSexe;
		this.race = pRace;
		nbreInstances++;
		addToList();
	}
	
	// Accesseurs
	public String getName() {
		return name;
	}
	
	public void addToList() {
		fishList.add(this);
	}
	
	public ArrayList<Object> getList() {
		ArrayList<Object> test = new ArrayList<Object>();
		test = fishList;
		return test;
	}
	
	public String getType() {
		return sexe; 
	}
}
