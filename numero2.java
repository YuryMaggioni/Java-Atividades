package ATV2_Yury;
import java.util.Scanner;
public class numero2 {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
    
	int x, y, z, result;
	        
	System.out.println("Escolha um n�mero: ");
	 x = sc.nextInt();
	        
	System.out.println("Escolha mais um n�mero: ");
	 y = sc.nextInt();
	 
	 System.out.println("Escolha outro n�mero: ");
	 z = sc.nextInt();
	        
	    result = x * y * z;
		System.out.println("A multiplica��o entre esses numeros � -> 2"+result);

	        sc.close();
	    }

	}

