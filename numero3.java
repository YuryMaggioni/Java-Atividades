package ATV2_Yury;
import java.util.Scanner;
public class numero3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float x, y, result;
        
		System.out.println("Escolha um número: ");
		 x = sc.nextInt();
		        
		System.out.println("Escolha mais um número: ");
		 y = sc.nextInt();
		        
		 if (x == 0){
			 System.out.println("Escolha outro valor que não seje 0: ");
			 
		 }
		    result = x / y;
			System.out.println("A divisão entre esses numeros é: -> "+ result);

		        sc.close();
		    }

		}

	


