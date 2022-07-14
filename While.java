import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		/*
		Faça um programa que receba o salário de um funcionário chamado Carlos.
		Sabe-se que outro funcionário, João, tem salário equivalente a um terço do 
			salário de Carlos. Carlos aplicará seu salário integralmente na poupança,
			que rende 2% ao mês, e João aplicará seu salário integralmente no fundo de
renda fixa, que rende 5% ao mês. O programa deverá calcular e mostrar a quantidade de 
meses necessários para que o valor pertencente a João iguale ou ultrapasse o valor pertencente a Carlos.*/

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Carlos, Qual é o seu salário: ");
		double salarioCarlos = sc.nextDouble();
		
		int mes = 0;
		
		double salarioJoao = salarioCarlos / 3;
		
		while (salarioJoao < salarioCarlos) {
	
		salarioCarlos += (salarioCarlos * 2 /100);
		salarioJoao += (salarioJoao * 5 /100);
		 mes = mes + 1;
		}
		System.out.println("O rendimento de carlos é: " + mes);

		sc.close();
		
	}

}