import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		/*
		Fa�a um programa que receba o sal�rio de um funcion�rio chamado Carlos.
		Sabe-se que outro funcion�rio, Jo�o, tem sal�rio equivalente a um ter�o do 
			sal�rio de Carlos. Carlos aplicar� seu sal�rio integralmente na poupan�a,
			que rende 2% ao m�s, e Jo�o aplicar� seu sal�rio integralmente no fundo de
renda fixa, que rende 5% ao m�s. O programa dever� calcular e mostrar a quantidade de 
meses necess�rios para que o valor pertencente a Jo�o iguale ou ultrapasse o valor pertencente a Carlos.*/

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Carlos, Qual � o seu sal�rio: ");
		double salarioCarlos = sc.nextDouble();
		
		int mes = 0;
		
		double salarioJoao = salarioCarlos / 3;
		
		while (salarioJoao < salarioCarlos) {
	
		salarioCarlos += (salarioCarlos * 2 /100);
		salarioJoao += (salarioJoao * 5 /100);
		 mes = mes + 1;
		}
		System.out.println("O rendimento de carlos �: " + mes);

		sc.close();
		
	}

}