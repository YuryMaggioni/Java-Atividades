
import java.util.Scanner;

public class while2 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         double valor = 1, quadrado, cubo, raiz;
         
         System.out.println("Digite o número para conta, digite 0 ou valor negativo para sair");
         
         while(valor > 0) {
             valor = sc.nextDouble();
             
     if(valor != 0) {
    	 
     quadrado = valor * valor;
     
     cubo = valor * valor * valor;
     
     raiz = Math.sqrt(valor);
     
             
     System.out.println("Valor ao :"+quadrado);
             System.out.println("Valor ao cubo:"+cubo);
             System.out.println("Raiz quadrada do numero é:"+raiz);
             System.out.println("Digite mais um número para calcular");
             }else {
                 System.out.println("Encerrando o programa.");
             }
         }
         sc.close();
    }
    
}