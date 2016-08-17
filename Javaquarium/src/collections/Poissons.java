package collections;

import java.util.Objects;

public class Poissons {
	// Var
	protected String name;
	protected String type;
	
	// Gestion du nbr d'instances
	public static int nbreInstances = 0;
	
	// Constructeur
	public Poissons()
	{
		name = "Bobby";
		type = "Male";
		nbreInstances++;
	}
	
	// Constructeur surchargé
	public Poissons(String pName, String pType)
	{
		this.name = pName;
		this.type = pType;
		nbreInstances++;
	}
	
	// Accesseurs
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type; 
	}
}
