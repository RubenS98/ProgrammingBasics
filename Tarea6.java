/*
Programa para que crea un arreglo de enteros aleatorios y copiar ese arreglo en otro.
Fecha: 09/10/2017
Ruben Sanchez
*/
import java.util.Random;
import java.util.Scanner;
public class Tarea6 {
    public static void main(String[] args) {
      int[] arreglo;
      int[] arreglo2;
      int num;
      Scanner lectura=new Scanner(System.in);
      Random ran=new Random();

      System.out.println("De cuantos valores quieres que sea el arreglo.");
      num=lectura.nextInt();

      arreglo = new int [num];

      for(int i=0; i<arreglo.length; i++){
        arreglo[i]=ran.nextInt(101)-50;
      }
      System.out.println("Los valores del arreglo son: ");
      for(int i=0; i<arreglo.length; i++){
        System.out.print(arreglo[i]+", ");
      }
      System.out.println();

      arreglo2 = new int [num];
      for(int i=0; i<arreglo.length; i++){
        arreglo2[i]=ran.nextInt(101)-50;
      }
      System.out.println("Los valores del segundo arreglo son: ");
      for(int i=0; i<arreglo2.length; i++){
        System.out.print(arreglo2[i]+", ");
      }
      System.out.println();
      for(int i=0; i<arreglo2.length; i++){
        arreglo2[i]=arreglo[i];
      }
      System.out.println("Si se copia el primer arreglo en el segundo, el segundo arreglo queda asi: ");
      for(int i=0; i<arreglo2.length; i++){
        System.out.print(arreglo2[i]+", ");
      }
    }
}
/*
C:\Users\thepo\OneDrive\Documentos\Programacion>java Tarea6
De cuantos valores quieres que sea el arreglo.
10
Los valores del arreglo son:
-49, 17, -19, 36, -13, 48, -14, -3, 8, -47,
Los valores del segundo arreglo son:
5, -47, 26, 37, 31, -19, -48, -20, 7, 10,
Si se copia el primer arreglo en el segundo, el segundo arreglo queda asi:
-49, 17, -19, 36, -13, 48, -14, -3, 8, -47,
*/
