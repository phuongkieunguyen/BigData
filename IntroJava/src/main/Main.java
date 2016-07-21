package main;

//import TableauDynamique.java;

public class Main {

	public static void main(String[] args) {
		Conteneur t[] = new Conteneur[2];
		t[0] = new Pile();
		t[1] = new File("file");
		remplirConteneurs(t);
		afficheConteneurs(t);
		retireConteneurs(t);
		afficheConteneurs(t);
	}
	public static void remplirConteneurs(Conteneur[] t){
		for (int i=0;i<100;i++){
			for (int c=0;c<t.length;c++){
				t[c].ajoute(new Integer(i));
			}
		}
	}
	public static void afficheConteneurs(Conteneur [] t){
		for (int c=0;c<t.length;c++){
			System.out.println("prochain de conteneur "+c+" = "+t[c].prochain());
		}		
	}
	public static void retireConteneurs(Conteneur[] t){
		for (int c=0;c<t.length;c++){
			t[c].retire();
		}
	}

}
