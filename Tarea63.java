/*
Programa para que crea un arreglo de enteros aleatorios y encontrar elementos repetidos dentro del arreglo.
Fecha: 09/10/2017
Ruben Sanchez
*/
import java.util.Random;
import java.util.Scanner;
public class Tarea63 {
    public static void main(String[] args) {
      int[] arreglo;
      boolean existencia=false;
      int num, num2;
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
      //Problema 3
      for(int i=0; i<arreglo.length; i++){
        for(int j=i; j<arreglo.length; j++){
          if(i==j){
          }
          else if(arreglo[i]==arreglo[j]){
            System.out.println("El numero "+arreglo[i]+" se repite en el arreglo.");
            existencia=true;
          }
        }
      }
      if(existencia==false){
        System.out.println("Ningun numero se repite.");
      }
    }
}
/*
C:\Users\thepo\OneDrive\Documentos\Programacion>java Tarea63
De cuantos valores quieres que sea el arreglo.
15
Los valores del arreglo son:
35, 15, 42, 26, 45, -7, -50, 12, -27, 45, -21, -46, 19, 41, 9,
El numero 45 se repite en el arreglo.
*/
