package Numero2;
import java.util.Scanner;
public class Pares {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int par=0, num, i; //informado variaveis

		for (i=1; i<=10; i++) { //iniciando laco para leitura dos numeros

		System.out.print("Informe numero: "); //solicitando numeros do usuario

		num = ler.nextInt(); //lendo numero

		if (num%2==0) { //verificando se eh par

		par=par+1; //se for par faz a contagem

		}

		}

		System.out.printf("Pares: %d\n", par); //informa o numero de pares

		System.out.printf("Impares: %d", 10-par);

		System.out.printf("\n");

		    return;



	}

}
