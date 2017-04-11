package trabalho01CG;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		
	Scanner scanner = new Scanner(new FileReader("C:\\Users\\yuri\\Desktop\\easy.txt"))
        .useDelimiter("");
	int numero = 0;
while (scanner.hasNext()) {

if( scanner.hasNextInt()){
	numero = scanner.nextInt(); 
	System.out.println(numero);}
	else{ 
		scanner.next();}



}
	}
		
}	
		
		
