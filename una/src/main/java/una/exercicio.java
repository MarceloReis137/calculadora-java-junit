package una;
import java.util.Scanner;

public class exercicio {
	
	public static void main(String[]args) { 
	Scanner teclado = new Scanner(System.in);
	int menu;
	double num1, num2;
	double somar, subtrair, multiplicar, dividir, potenciar;
	calculadora calculo = new calculadora();
	
	System.out.print("Digite o primeiro numero: ");
	num1 = teclado.nextDouble();
	
	System.out.print("Digite o segundo numero: ");
	num2 = teclado.nextDouble();
	
	System.out.printf("1 - Somar%n2 - Subtrair%n3 - Multiplicar%n4 - Dividir%n5 - Potenciar");
	menu = teclado.nextInt();
	
	if (menu == 1) {
		somar = calculo.somar(num1, num2);
		System.out.print(somar);
	}
	else if (menu == 2) {
		subtrair = calculo.subtrair(num1, num2);
		System.out.print(subtrair);
	}
	else if (menu == 3) {
		multiplicar = calculo.multiplicar(num1, num2);
		System.out.print(multiplicar);
	}
	else if (menu == 4) {
		dividir = calculo.dividir(num1, num2);
		System.out.print(dividir);
	}
	else if (menu == 5) {
		potenciar = calculo.potenciar(num1, num2);
		System.out.print(potenciar);
	}
	teclado.close();
	}
}


