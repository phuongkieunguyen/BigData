package main;

public interface Matrice<T> {
	public int getNbLignes();
	public int getNbColonnes();
	public T lire(int i, int j);
	public void ecrire(int i, int j, T obj);
	
}
