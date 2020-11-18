package Soma1888;
import java.util.Scanner;

public class Numeros_Soma111 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero=0, resultado=0; 

		System.out.print("Digite o numero: \n"); 
		resultado = ler.nextInt();  

		    do{ 
		    
		    resultado=resultado+numero; 
		    numero=numero-1; 
		    
		    }while(numero>=0); 
		    System.out.printf("%d", resultado);

	}

}
