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
	
	public int[] getReta(int frame){
		int[] reta = new int[2];
		int Xa = x[frame];
		int Ya = y[frame];
		reta [0] = (y[count] - Ya) / ( x[count] - Xa); 
		reta [1] = Ya - a*Xa;
		
		return caminho;
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
	
	public int getDesvios(int frame){
		int aux = 0;
			
		int [2] reta = getReta(0);
		
		for (int c = 0; c <= count, c++ ){
			
			int eY = y[c] * reta[0] + reta[1];
			int realY = y[c];
			
			if(realY - eY > (2*metragem) || realY - eY <(-2*metragem)){
				return = c;
				
			}
			aux ++;
			
			
		} 
		return -1;
		
	
	
	} 
}
