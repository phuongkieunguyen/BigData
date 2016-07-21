package main;

public abstract class AbstractMatrice<T> implements Matrice<T> {
	private int m, n;
	private T value [] [] ;
	public AbstractMatrice(int M, int N){
		m = M; n = N;
		for (int i=0; i<M; i++){
			for (int j=0; j<N; j++){
				value[i][j] =0 ;// not correct here
			}
		}
	}
	public T lire(int i, int j){
		return value[i][j];
	}
	
	public void ecrire(int i, int j, T element){
		value[i][j] = element;
	}
}
