package ATV2_Yury;
import java.util.Scanner;
public class numero5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float salario, result;
        
		System.out.println("Qual é o seu salário fixo?: ");
		 salario = sc.nextInt();
		        
	
		    result = (float) (salario * 1.04);
			System.out.println("O seu salário fixo + comissões foi de -> "+result);

		        sc.close();
		    }

		}

	