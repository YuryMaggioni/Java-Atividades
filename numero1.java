package ATV2_Yury;
import java.util.Scanner;
public class numero1 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	        
	int x, y, result;
	        
	System.out.println("Escolha um n�mero: ");
	 x = sc.nextInt();
	        
	System.out.println("Escolha mais um n�mero: ");
	 y = sc.nextInt();
	        
	    result = x - y;
		System.out.println("A subtra��o entre esses numeros �: -> "+result);

	        sc.close();
	    }

	}