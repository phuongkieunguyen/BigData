package main;

public abstract class ConteneurTableauDynamique extends TableauDynamique
												implements Conteneur {

	public ConteneurTableauDynamique ( String name){
		super(name);
	}
	public boolean estVide() {
		// TODO Auto-generated method stub
		if (super.nbElements() >0)
			return true;
		else
			return false;
	}

	public int nbElements() {
		// TODO Auto-generated method stub
		return super.nbElements();
	}
}
