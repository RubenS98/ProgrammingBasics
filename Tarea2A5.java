/*Programa que rellena una matriz de NXN con numeros aleatorios(N dada por el usuario y N siendo un impar entre 3 y 11) y que determina si la matriz es simetrica.
Ruben Sanchez
Fecha: 14/10/2017
*/
import java.util.Random;
import java.util.Scanner;
public class Tarea2A5
{
	public static void main(String[] args){
		int[][] matriz;
		Random ran = new Random();
    Scanner lectura = new Scanner(System.in);
    int num;
		boolean magico = false

    System.out.println("Escribe el numero de renglones y columnas N que quieres que tenga la matriz (NXN), debes elegir un numero impar entre 3 y 11.");
    num=lectura.nextInt();
    while(num%2==0 || (num<3 || num>11)){
      if(num%2==0){
        System.out.println("Ese numero es par, escribe uno impar.");
        num=lectura.nextInt();
      }
      else if(num<3 || num>11){
        System.out.println("Ese numero no esta entre 3 y 11. Escribe uno que si este.");
        num=lectura.nextInt();
      }
    }

    matriz = new int [num][num];

		do{
			for(int renglones=0; renglones<matriz.length; renglones++){
				for(int columnas=0; columnas<matriz[0].length; columnas++){
					matriz [renglones][columnas] = ran.nextInt(num+1);
					System.out.print(matriz[renglones][columnas]+"\t");
				}
				System.out.println();
			}
			
		}while(magico==false);

	}//cierre main
}
/*

*/
