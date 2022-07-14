import java.util.Scanner;

public class switch_atv {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é o seu código: ");
		int x = sc.nextInt();
		
		System.out.println("Qual é o seu salario: ");
		double salario = sc.nextDouble();
		
		String cargo;
		double percent = 0, calc;

		switch (x) {
		case 1:
			cargo = "Escriturário ";
			percent = 0.5;
			break;
		case 2:
			cargo = "Secretário";
			percent = 0.35;
			break;
		case 3:
			cargo = "Caixa";
			percent = 0.2;
			break;
		case 4:
			cargo = "Gerente";
			percent = 0.1;
			break;
		case 5:
			cargo = "Diretor";
			percent = 0;
			break;
		default: 
			cargo = "Inválido";
		}
		
		calc = (salario * percent) + salario;
				
		System.out.println("O seu cargo é " + cargo + "E seu novo salário é: " + calc );
		sc.close();
	}
}

