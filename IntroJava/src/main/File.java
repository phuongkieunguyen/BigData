package main;

public class File extends ConteneurTableauDynamique {
	
	// constructeur
	public File ( String name){
		super(name);
	}
	@Override
	public void ajoute(Object element) {
		// TODO Auto-generated method stub
		super.ecrire(super.nbElements(), element);
	}
	public Object retire(){		
		Object temp = obj[0];
		Object [] tab_temp= new Object[super.nbElements()-1];
		for (int i=1;i<super.nbElements();i++){
			tab_temp[i-1] = obj[i];
		}
		obj = tab_temp;
		return temp;
	}

	public Object prochain() {		
		return super.lire(0);
	}

}
