package ATV2_Yury;
import java.util.Scanner;
public class numero1 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	        
	int x, y, result;
	        
	System.out.println("Escolha um número: ");
	 x = sc.nextInt();
	        
	System.out.println("Escolha mais um número: ");
	 y = sc.nextInt();
	        
	    result = x - y;
		System.out.println("A subtração entre esses numeros é: -> "+result);

	        sc.close();
	    }

	}
