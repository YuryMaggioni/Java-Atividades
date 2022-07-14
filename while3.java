import java.util.Scanner;
public class while3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double numero_1,numero_2,numero_3,calc;
        
        
        int a = 0;
        
        do {
        a = a + 3;
        System.out.println("Digite 3 números");
        
        numero_1 = sc.nextDouble();
        numero_2 = sc.nextDouble();
        numero_3 = sc.nextDouble();
        
        calc = numero_1 + numero_2 + numero_3;
        System.out.println("A soma é: " +calc);
        
        
        if(numero_1 > numero_2 && numero_1 > numero_3) {
            System.out.println("O maior número é: "+ numero_1);
         
        }else if(numero_2 > numero_1 && numero_2 > numero_3) {
        	
            System.out.println("O maior número é: "+numero_2);
        }else {
            System.out.println("O maior número é: "+numero_3);
        }
        
        if(numero_1 < numero_2 && numero_1 < numero_3) {
        	
            System.out.println("O menor número é: "+ numero_1);
            
        }else if(numero_2 < numero_1 && numero_2 < numero_3) {
        	
            System.out.println("O menor número é: "+numero_2);
        }else {
            System.out.println("O menor número é: "+numero_3);
        }
        
        
        System.out.println(+a+" Números foram digitados.");
        }
        while (numero_1 != 30000||numero_2 != 30000 || numero_3 != 30000 );
        sc.close();
    }

}