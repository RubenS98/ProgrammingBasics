/*
Programa para que crea un arreglo de enteros aleatorios, copia el arreglo en otra,
busca un valor dentro del arreglo y encuentra elementos repetidos dentro del arreglo.
Fecha: 09/10/2017
Ruben Sanchez
*/
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
public class Tarea6 {
    public static void main(String[] args) {
      int[] arreglo;
      int[] arreglo2;
      int[] repetidos;
      boolean existencia=false;
      int num, num2, min=-50, max=50;
      Scanner lectura=new Scanner(System.in);

      System.out.println("De cuantos valores quieres que sea el arrelo.");
      num=lectura.nextInt();

      arreglo = new int [num];

      for(int i=0; i<arreglo.length; i++){
        arreglo[i]=ThreadLocalRandom.current().nextInt(min, max);
      }
      System.out.println("Los valores del arreglo son: ");
      for(int i=0; i<arreglo.length; i++){
        System.out.print(arreglo[i]+", ");
      }
      System.out.println();
      //Problema 1
      arreglo2 = new int [num];

      for(int i=0; i<arreglo2.length; i++){
        arreglo2[i]=arreglo[i];
      }
      System.out.println("Los valores del segundo arreglo son: ");
      for(int i=0; i<arreglo.length; i++){
        System.out.print(arreglo2[i]+", ");
      }
      System.out.println();
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
      System.out.println();
      //Problema 3
      for(int i=0; i<arreglo.length; i++){
        for(int j=i; j<arreglo.length; j++){
          if(i==j){
          }
          else if(arreglo[i]==arreglo[j]){
            System.out.println("El numero "+arreglo[i]+" se repite en el arreglo.");
          }
        }
      }
    }
}
/*
C:\Users\thepo\OneDrive\Documentos\Programacion>java Tarea6
De cuantos valores quieres que sea el arrelo.
15
Los valores del arreglo son:
13, 15, 11, -43, 0, -16, -38, -7, 13, 27, 44, 23, 44, 12, -3,
Los valores del segundo arreglo son:
13, 15, 11, -43, 0, -16, -38, -7, 13, 27, 44, 23, 44, 12, -3,

Escribe el numero que quieres buscar.
-7
El numero -7 esta en la posicion 7 del arreglo.

El numero 13 se repite en el arreglo.
El numero 44 se repite en el arreglo.
*/
