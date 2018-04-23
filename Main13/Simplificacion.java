import java.util.Scanner;

import java.util.InputMismatchException;

public class Simplificacion
{
	static int num1,num2;
	public static void main(String[] args)
	{ Scanner objetoScanner = new Scanner(System.in);
		try
		{
			System.out.print("\n Ingresa el primer numero\n Si se ingresa un valor invalido\n El valor por defecto es 1: ");
			num1 = objetoScanner.nextInt();
		}
		catch (InputMismatchException ime) {System.out.println("\n\tValor invalido"); num1=1;}
		try
		{
			objetoScanner.nextLine();
			System.out.print("\n Ingresa el segundo numero\n Si se ingresa un valor invalido\n El valor por defecto es 1: ");
			num2 = objetoScanner.nextInt(); objetoScanner.nextLine();
			int r=num1/num2;
		}
		catch (ArithmeticException ae) {System.out.println("\n\tValor invalido"); num2=1;}
		catch (InputMismatchException ime) {System.out.println("\n\tValor invalido"); num2=1;}
		int comparador = Math.max(num1, num2);
		//System.out.println("\n Valor original comparador: "+comparador);
		while(comparador!=0)
		{
			if(comparador==1 && ((num1*num1)==num2))
			{
				//System.out.println("\n if 1");
				num2=num2/num1; num1=num1/num1;
				System.out.println("\n "+num1+"/"+num2);
				comparador=0;
			}
			else if(((num1%comparador)==0) && ((num2%comparador)==0))
			{
				//System.out.println("\n if 2\n comparador:"+comparador);
				num1=num1/comparador; num2=num2/comparador;
				System.out.println("\n "+num1+"/"+num2);
				comparador=0;
			}
			else comparador--;
		}
	}
}