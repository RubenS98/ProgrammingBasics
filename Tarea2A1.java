/*Programa que rellena una matriz de NXN con numeros aleatorios del 0 al 7 (N dada por el usuario) y que determina si la matriz es simetrica.
Ruben Sanchez
Fecha: 14/10/2017
*/
import java.util.Random;
import java.util.Scanner;
public class Tarea2A1
{
	public static void main(String[] args){
		int[][] matriz;
		Random ran = new Random();
    Scanner lectura = new Scanner(System.in);
    int num;

    System.out.println("Escribe el numero de renglones y columnas N que quieres que tenga la matriz (NXN)");
    num=lectura.nextInt();

    matriz = new int [num][num];

		for(int renglones=0; renglones<matriz.length; renglones++){
			for(int columnas=0; columnas<matriz[0].length; columnas++){
				matriz [renglones][columnas] = ran.nextInt(8);
				System.out.print(matriz[renglones][columnas]+"\t");
			}
			System.out.println();
		}


    analizar(matriz);
	}//cierre main
  public static void analizar(int matriz[][]){
    boolean simetrico=true;

    for(int i=0; i<matriz.length; i++){
			for(int j=0; j<matriz[0].length; j++){
				if(matriz[i][j]==matriz[j][i]){
        }
        else{
          simetrico=false;
        }
			}//cierre for interno
		}// cierre for externo

    if(simetrico==true){
      System.out.println("La matriz es simetrica.");
    }//cierre if
    else{
      System.out.println("La matriz no es simetrica.");
    }//cierre de else
  }//cierre analizar
}
/*
C:\Users\thepo\OneDrive\Documentos\Programacion>java Tarea2A1
Escribe el numero de renglones y columnas N que quieres que tenga la matriz (NXN)
5
4       2       0       6       3
1       2       7       4       0
4       3       3       3       0
7       5       7       6       7
2       7       2       4       3
La matriz no es simetrica.

C:\Users\thepo\OneDrive\Documentos\Programacion>java Tarea2A1
Escribe el numero de renglones y columnas N que quieres que tenga la matriz (NXN)
2
4       1
1       2
La matriz es simetrica.
*/
