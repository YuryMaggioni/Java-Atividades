package ATV2_Yury;
import java.util.Scanner;
public class numero4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float produt, result;
        
		System.out.println("Qual o pre�o do produto: ");
		 produt = sc.nextInt();
		        
	
		    result = (float) (produt * 0.9);
			System.out.println("O pre�o do produto com desconto �: -> "+result);

		        sc.close();
		    }

		}

	