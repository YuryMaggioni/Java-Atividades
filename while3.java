import java.util.Scanner;
public class while3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double numero_1,numero_2,numero_3,calc;
        
        
        int a = 0;
        
        do {
        a = a + 3;
        System.out.println("Digite 3 n�meros");
        
        numero_1 = sc.nextDouble();
        numero_2 = sc.nextDouble();
        numero_3 = sc.nextDouble();
        
        calc = numero_1 + numero_2 + numero_3;
        System.out.println("A soma �: " +calc);
        
        
        if(numero_1 > numero_2 && numero_1 > numero_3) {
            System.out.println("O maior n�mero �: "+ numero_1);
         
        }else if(numero_2 > numero_1 && numero_2 > numero_3) {
        	
            System.out.println("O maior n�mero �: "+numero_2);
        }else {
            System.out.println("O maior n�mero �: "+numero_3);
        }
        
        if(numero_1 < numero_2 && numero_1 < numero_3) {
        	
            System.out.println("O menor n�mero �: "+ numero_1);
            
        }else if(numero_2 < numero_1 && numero_2 < numero_3) {
        	
            System.out.println("O menor n�mero �: "+numero_2);
        }else {
            System.out.println("O menor n�mero �: "+numero_3);
        }
        
        
        System.out.println(+a+" N�meros foram digitados.");
        }
        while (numero_1 != 30000||numero_2 != 30000 || numero_3 != 30000 );
        sc.close();
    }

}