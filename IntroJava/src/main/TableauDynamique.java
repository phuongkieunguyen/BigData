
package main;


public class TableauDynamique {
	protected Object [] obj;
	protected String nom;
	// constructeur
	public TableauDynamique(String name){
		this.nom = name;
		this.obj = new Object[6];
	}
	// lire
	public Object lire(int i)
	{
		if (i >= nbCases()){
			return null;
		} 
		return obj[i];
	}
	// méthode écrire dynamique
	public void ecrire(int i, Object obj_ele)
	{
		if (i <0)
			System.out.println("indice must be non-negative number!!!");
		else {
			if (i >= nbCases()){
				Object [] new_obj= new Object[i+1];
				for (int k=0; k<nbCases();k++){
					new_obj[k] = obj[k];
				}
				obj = new_obj;
			}
			
			obj[i] = obj_ele;
		}
			
	}
	public String toString(){
		String nonVide = "";
		for (int k=0; k<obj.length;k++){
			if (lire(k)!= null){
				nonVide +=obj[k];
				nonVide +='\n';
			}
		}
		return nonVide;
	}

	public String getNom(){
		return this.nom;
	}
	public int nbElements(){
		int res = 0;
		for (int k=0; k<nbCases();k++){
			if (lire(k)!= null){
				res++;
			}
		}
		return res;
	}
	public int nbCases(){
		return obj.length;
	}
}
