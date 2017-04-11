package trabalho01CG;

import java.util.ArrayList;
import java.util.List;

public class Pessoa  {
	
	int id;
	private int[] x;
	private int[] y;
	int count;
	int metragem;
	
	public Pessoa (int ida, int tamanho, int metro){
		x = new int[tamanho];
		y = new int[tamanho];
		int id = ida;
		metragem = metro;
		count = 0;
	}
	
	public int[] getCaminho(int frame){
		int[] caminho = new int[count - frame];
		int Xa = x[frame];
		int Ya = y[frame];
		double a = (y[count] - Ya) / ( x[count] - Xa); 
		double b = Ya - a*Xa;
		return null;
	}

	public double getSpeed(){
		return 0; }
	
	public void addFrame(int cx, int cy){
		x[count] = cx;
		y[count] = cy;
		count ++;
	}
	
	public int[] getX(){
		
		return x.clone();
	}
	
	public int[] getY(){
		
		return y.clone();
		}
	
	
	public int getTempo(){ 
		int x = 0 + count;
		return x;
	}
}

