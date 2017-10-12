/*
Programa para que crea un arreglo de enteros aleatorios y
buscar un valor dentro de ese arreglo.
Fecha: 09/10/2017
Ruben Sanchez
*/
import java.util.Random;
import java.util.Scanner;
public class Tarea62 {
    public static void main(String[] args) {
      int[] arreglo;
      int num, num2;
      boolean existencia=false;
      Scanner lectura=new Scanner(System.in);
      Random ran = new Random();

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
      //Problema 2
      System.out.println("Escribe el numero que quieres buscar.");
      num2=lectura.nextInt();

      for(int i=0; i<arreglo.length; i++){
        if(arreglo[i]==num2){
          System.out.println("El numero "+num2+" esta en la posicion "+i+" del arreglo.");
          existencia=true;
        }
      }
      if(existencia==false){
        System.out.println("El numero "+num2+" no esta en el arreglo.");
      }
    }
}
/*
C:\Users\thepo\OneDrive\Documentos\Programacion>java Tarea62
De cuantos valores quieres que sea el arreglo.
10
Los valores del arreglo son:
18, 31, 24, -14, -10, -2, 39, -11, -26, -28,
Escribe el numero que quieres buscar.
-14
El numero -14 esta en la posicion 3 del arreglo.
*/
