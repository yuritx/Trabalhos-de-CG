package trabalho01CG;

import java.util.ArrayList;
import java.util.List;

public class Pessoa  {
	
	int id;
	private List<Integer> x;
	private List<Integer> y;
	private List<Integer> tempo;
	
	
	public Pessoa (int ida){
		x = new ArrayList<Integer>();
		y = new ArrayList<Integer>();
		tempo = new ArrayList<Integer>();
		int id = ida;
	}
	
	public List<Integer> getCaminho(){
		return x;
	}

	public double getSpeed(){
		return 0; }
	
	public void addFrame(int cx, int cy, int time){
		x.add(cx);
		y.add(cy);
		tempo.add(time);
	}
	
	public List<Integer> getX(){
		List<Integer> clonedList = new ArrayList<Integer>(x.size());
		for (int aux : x) {
			clonedList.add(aux);
	    }
		return clonedList;
	}
	
	public List<Integer> getY(){
		List<Integer> clonedList = new ArrayList<Integer>(y.size());
		for (int aux : y) {
			clonedList.add(aux);
	    }
		return clonedList;
		}
	
	
	public List<Integer> getTempo(){ 
		List<Integer> clonedList = new ArrayList<Integer>(tempo.size());
		for (int aux : tempo) {
			clonedList.add(aux);
	    }
		return clonedList;
	}
}

