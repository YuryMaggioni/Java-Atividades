package ATV2_Yury;
import java.util.Scanner;
public class numero5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float salario, result;
        
		System.out.println("Qual � o seu sal�rio fixo?: ");
		 salario = sc.nextInt();
		        
	
		    result = (float) (salario * 1.04);
			System.out.println("O seu sal�rio fixo + comiss�es foi de -> "+result);

		        sc.close();
		    }

		}

	