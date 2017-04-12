package trabalho01CG;

import java.util.ArrayList;
import java.util.List;

public class Pessoa  {
	
	int id;
	private int[] x;
	private int[] y;
	int metragem;
	int count;
	int tempo;
	
	public Pessoa (int ida, int tamanho, int metro, int time){
		x = new int[tamanho];
		y = new int[tamanho];
		int id = ida;
		metragem = metro;
		tempo = time;
		
	}
	
	public double[] getReta(int frame1, int frame2){
		double[] reta = new double [2];
		int Xa = x[frame1];
		int Ya = y[frame1];
		int Xb = x[frame2];
		int Yb = y[frame2];
		if(Xb -Xa==0 || Ya - Yb==0){
			reta[0] = 0;
			reta[1] = 0;
			return reta;
		}
		
		double m = (float)(y[frame2] - Ya) / ( x[frame2] - Xa); 
		reta[0]= m;
		reta[1]= y[frame1] + m * (x[frame1] * (-1));
		
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
		return tempo;
	}
	
	public int getDesvio(int frame1, int frame2){
		if(frame1<tempo) return -1;
		if(frame2> count+tempo) return -1;
		frame1 = frame1 - tempo;
		frame2 = frame2 - tempo;
		
		
		if(x[frame1]== x[frame2]){
			for (int c = frame1; c < frame2; c++ ){
				if(x[c] - x[frame1] > (2*metragem) || x[c] - x[frame1] <(-2*metragem)){
				return  c + tempo;
				}
			}  
		}
		
		if(y[frame1]== y[frame2]){
			for (int c = frame1; c < frame2; c++ ){
				if(y[c] - y[frame1] > (2*metragem) || y[c] - y[frame1] <(-2*metragem)){
				return  c + tempo;
				}
			}  
		}
		

		int aux = -1;
		double [] reta = getReta(frame1, frame2);
		
		for (int c = frame1; c < frame2; c++ ){
			int erro = x[c];
			double eY = x[c] * reta[0] + reta[1];
			double realY = y[c];
			
			if(realY - eY > (2*metragem) || realY - eY <(-2*metragem)){
				aux = c + tempo;
				c = count;
			}
		}  
		if (aux == -1) return -1; 
		
		int desvios = getDesvio(aux + tempo, frame2 + tempo);
		if(desvios > -1) return desvios; 
		
		return aux;
	} 
	
	public int getCount(){
		return count;
	}
	
}
	

