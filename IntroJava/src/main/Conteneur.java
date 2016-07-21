package main;

public interface Conteneur {
	public void ajoute(Object element);
	public Object retire();
	public Object prochain();
	public boolean estVide();
	public int nbElements ();
}

