package trabalho01CG;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
	ArrayList <Pessoa> pessoas = new ArrayList<Pessoa>();  	
	Scanner scanner = new Scanner(new FileReader("C:\\Users\\yuri\\Desktop\\paths_d.txt"))
    .useDelimiter("\\n"); 
	int metro = 0;
	String wq = scanner.next();
	metro = Integer.parseInt(wq.replaceAll("[^0-9]", ""));
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
					String th = scan.next();
					int valordX= Integer.parseInt(th.replaceAll("[^0-9]", ""));
					th = scan.next();
					int valordY= Integer.parseInt(th.replaceAll("[^0-9]", ""));
					th = scan.next();
					int tempoI= Integer.parseInt(th.replaceAll("[^0-9]", ""));
					pes = new Pessoa(pessoas.size(), frames, metro, tempoI);
					pes.addFrame(valordX, valordY);
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

	Pessoa test = pessoas.get(4);
	int er = test.getDesvio(84, 279);
	//for(int c : test){
	int jkdb = test.getDesvio(84,168);
	System.out.println(er);
	System.out.println(jkdb);
	//}
	}

}	
		
