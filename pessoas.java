package trabalho01CG;

import java.util.ArrayList;
import java.util.List;

public class Pessoa  {
	
	int id;
	private int[] x;
	private int[] y;
	int metragem;
	int count;
	
	public Pessoa (int ida, int tamanho, int metro){
		x = new int[tamanho];
		y = new int[tamanho];
		int id = ida;
		metragem = metro;
		
	}
	
	public double[] getReta(int frame){
		double[] reta = new double [2];
		int Xa = x[frame];
		int Ya = y[frame];
		double m = (float)(y[count -1] - Ya) / ( x[count-1] - Xa); 
		reta[0]= m;
		reta[1]= y[frame] + m * (x[frame] * (-1));
		
		return reta;
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
	
	public int getDesvio(int frame){
		int aux = 0;
			
		double [] reta = getReta(0);
		
		for (int c = 0; c < count; c++ ){
			
			double eY = x[c] * reta[0] + reta[1];
			double realY = y[c];
			
			if(realY - eY > (2*metragem) || realY - eY <(-2*metragem)){
				return c;
				
			}
			aux ++;
			
			
		} 
		return -1;
		
	
	
	} 
}
