/*Programa que crea un cuadro magico de NXN con numeros aleatorios(N dada por el usuario y N siendo un impar entre 3 y 11).
Ruben Sanchez
Fecha: 14/10/2017
*/
import java.util.Random;
import java.util.Scanner;
public class Tarea2A5
{
	public static void main(String[] args){
		int[][] matriz;
		int [] renglonesM;
		int [] columnasM;
		Random ran = new Random();
    Scanner lectura = new Scanner(System.in);
    int num;
		int suma=0;
		int valor=0;
		boolean magico = false;
		boolean mismo = true;

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
		renglonesM = new int [num];
		columnasM = new int [num];
		do{
			for(int renglones=0; renglones<matriz.length; renglones++){
				for(int columnas=0; columnas<matriz[0].length; columnas++){
					matriz [renglones][columnas] = ran.nextInt(num+1);
					System.out.print(matriz[renglones][columnas]+"\t");
				}
				System.out.println();
			}
			System.out.println();
			for(int renglones=0; renglones<matriz.length; renglones++){
				for(int columnas=0; columnas<matriz[0].length; columnas++){
					suma+= matriz[renglones][columnas];
				}
				renglonesM[renglones]=suma;
			}
			for(int i=0; i<(renglonesM.length-1); i++){
				if(renglonesM[i]!=renglonesM[i+1]){
					mismo=false;
				}
			}
			if(mismo==true){
				magico=true;
			}
		}while(magico==false);

	}//cierre main
}
/*

*/
