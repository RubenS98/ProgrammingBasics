/*Programa que crea un cuadro magico de NXN con numeros aleatorios(N dada por el usuario y N siendo un impar entre 3 y 11).
Ruben Sanchez
Fecha: 19/10/2017
*/
import java.util.Scanner;
public class Tarea2A5
{
	public static void main(String[] args){
		int[][] matriz;
    Scanner lectura = new Scanner(System.in);
    int num;
		int suma=0;
		int inicialR, inicialC, cuadrado, actualR=0, actualC=0, tempR, tempC, tempR2, tempC2;
		int valor=0;
		boolean sale=false;

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
		inicialR=0;
		inicialC=num/2;
		cuadrado=num*num;

		actualR=inicialR;
		actualC=inicialC;

		for(int i=1; i<=cuadrado; i++){
			if(i==1){
				matriz[inicialR][inicialC]=i;

			}
			else if(actualR==0 || actualC==(num-1)){
				tempR=actualR;
				tempC=actualC;
				if(actualR==0 && actualC==(num-1)){
					tempR=(num-1);
					tempC=0;
					tempR2=tempR;
					tempC2=tempC;
				}
				else if(actualR==0){
					tempR=(num-1);
					tempC++;
					tempR2=tempR;
					tempC2=tempC;
				}
				else {
					tempC=0;
					tempR--;
					tempR2=tempR;
					tempC2=tempC;
				}
				if(matriz[tempR2][tempC2]!=0){
					actualR=actualR+1;
					matriz[actualR][actualC]=i;
				}
				else{
					matriz[tempR][tempC]=i;
					actualR=tempR;
					actualC=tempC;
				}
			}
			else if(matriz[actualR-1][actualC+1]!=0){
				actualR=actualR+1;
				matriz[actualR][actualC]=i;
			}
			else{
				actualR--;
				actualC++;
				matriz[actualR][actualC]=i;
			}
		}
		for(int renglones=0; renglones<matriz.length; renglones++){
			for(int columnas=0; columnas<matriz[0].length; columnas++){
				System.out.print(matriz[renglones][columnas]+"\t");
			}
			System.out.println();
		}
	}//cierre main
}
/*
C:\Users\thepo_000\Desktop\Programacion>java Tarea2A5
Escribe el numero de renglones y columnas N que quieres que tenga la matriz (NXN), debes elegir un numero impar entre 3 y 11.
3
8       1       6
3       5       7
4       9       2
*/
