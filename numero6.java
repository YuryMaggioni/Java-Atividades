package ATV2_Yury;
import java.util.Scanner;
public class numero6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		float sal_min, salario, result;
        	sal_min = 1212;
        	
        	System.out.println("Qual é o seu salário atual?: ");
   		    salario = sc.nextInt();
   		        
		    result = (float) (salario / sal_min );
			System.out.println("Seu salario é de  " +result + "salarios minimos");

		        sc.close();
		    }

		}

	