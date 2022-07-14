package ATV2_Yury;
import java.util.Scanner;
public class numero2 {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
    
	int x, y, z, result;
	        
	System.out.println("Escolha um número: ");
	 x = sc.nextInt();
	        
	System.out.println("Escolha mais um número: ");
	 y = sc.nextInt();
	 
	 System.out.println("Escolha outro número: ");
	 z = sc.nextInt();
	        
	    result = x * y * z;
		System.out.println("A multiplicação entre esses numeros é -> 2"+result);

	        sc.close();
	    }

	}

