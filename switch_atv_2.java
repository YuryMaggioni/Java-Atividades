import java.util.Scanner;

public class switch_atv_2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o número de um produto de 1 á 10: ");
        int numero_produto = sc.nextInt();
        
        System.out.println("Qual o peso do produto em Kilogramas: ");
        double peso_produto = sc.nextDouble();
        
        System.out.println("Qual será o país de origem? Digite 1, 2 ou 3");
        int codigo_pais = sc.nextInt();
        
        String nome_produto;
        double calc_peso = 0, preco_imposto, calc_imposto, preco_tot;
        
        switch(codigo_pais) {
        case 1:
            preco_imposto = 0;
            break;
        case 2:
            preco_imposto = 0.15;
            break;
        case 3:
            preco_imposto = 0.25;
            break;
        default:
            preco_imposto = 0;
            nome_produto = "nome inválido";
            sc.close();
        }
        
        	switch (numero_produto) {
        	case 1:
        		nome_produto = "Filé Mignon";
        		break;
        	case 2:
        		nome_produto = "Maminha";
        		break;
        	case 3:
        		nome_produto = "Picanha";
        		break;
        	case 4:
        		nome_produto = "Coxão mole";
        		break;
        	case 5:
        		nome_produto = "Ameixa";
        		break;
        	case 6:
        		nome_produto = "Patinho";
        		break;
        	case 7:
        		nome_produto = "Lagarto";
        		break;
        	case 8:
        		nome_produto = "Contrafilé";
            	break;
        	case 9:
        		nome_produto = "Alcatra";
        		break;
        	case 10:
        		nome_produto = "Costela";
        		break;
        	default:
        		nome_produto = "Chuleta";
        	}

        if(numero_produto <= 4) {
        	
            calc_peso = peso_produto * 10;
            
        }else if(numero_produto <= 7) {
        	
            calc_peso = peso_produto * 25;
            
        }else if(numero_produto <= 10) {
        	
            calc_peso = peso_produto * 35;
        }
        
        
      
        calc_imposto = calc_peso * preco_imposto;
        
        preco_tot = calc_peso + calc_imposto;
        
        System.out.println("O produto escolhido foi " + nome_produto);
        
        System.out.println("O peso do produto informado foi " + peso_produto);
        
        System.out.println("O preço do produto é: " + calc_peso);
        
        System.out.println("O valor do imposto é: " + calc_imposto);
        
        System.out.println("O valor total da compra é " + preco_tot );

        
        sc.close();
    }

}