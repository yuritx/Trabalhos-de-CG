package trabalho01CG;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
	ArrayList <Pessoa> pessoas = new ArrayList<Pessoa>();  	
	Scanner scanner = new Scanner(new FileReader("C:\\Users\\yuri\\Desktop\\paths_d.txt"))
    .useDelimiter("\\n"); 
	int metro = 0;
	while (scanner.hasNextLine()) {
		Pessoa pes = null;
		String g = scanner.nextLine();
		Scanner scan = new Scanner(g).useDelimiter("[, ) \\t]");
		int aux = 0;
		while (scan.hasNext()){
			switch(aux){
				case 0:
					String x = scan.next();
					int frames = Integer.parseInt(x.replaceAll("[^0-9]", ""));
					pes = new Pessoa(pessoas.size(), frames, metro);
					aux =1;
				case 1:
					String z = scan.next();
					int valorX= Integer.parseInt(z.replaceAll("[^0-9]", ""));
					z = scan.next();
					int valorY= Integer.parseInt(z.replaceAll("[^0-9]", ""));
					pes.addFrame(valorX, valorY);
				case 2:
					scan.next();
					aux = 1;
			}	
		}
		scan.close();
		pessoas.add(pes);
	}

	scanner.close();
	}
		
}	
		
