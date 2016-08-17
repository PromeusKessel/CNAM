package collections;

public class PoissonsHerbi extends Poissons {
	// Var
	protected String name;
	protected String sex;
	protected String regime;

	// Gestion du nbr d'instances
	protected static int nbreInstances = 0;

	public PoissonsHerbi(String pName, String pType, String pRace)
	{
		super(pName, pType, pRace);
	}
} 