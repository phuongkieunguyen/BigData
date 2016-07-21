package main;

public class Pile extends ConteneurTableauDynamique {
	
	private static String name = "pile";
	// constructeur
	public Pile (){
		super(name);
	}
	@Override
	public void ajoute(Object element) {
		// TODO Auto-generated method stub
		super.ecrire(super.nbElements(), element);
	}
	public Object retire(){		
		Object temp= obj[super.nbElements()-1];
		Object [] tab_temp= new Object[super.nbElements()-1];
		for (int i=0;i<super.nbElements()-1;i++){
			tab_temp[i] = obj[i];
		}
		obj = tab_temp;
		return temp;
	}

	public Object prochain() {		
		return super.lire(super.nbElements()-1);
	}

}
