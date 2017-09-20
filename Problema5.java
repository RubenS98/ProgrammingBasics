/***************************************
 *  Problema 5
 *  Por Carlos Garcia, Ruben Sanchez y Daniela Vignau
 *  ITESM
 *  5. Considera estás desarrollando un programa Java donde necesitas comprobar
 *  las características de una rueda. Sus características son:  grosor (double)
 *  y diametro (double).
 *  a) Si el diámetro es superior a 1.4 debe mostrarse por consola el mensaje
 *  “La rueda es para un vehículo grande”. Si es menor o igual a 1.4 pero mayor
 *  que 0.8 debe mostrarse por consola el mensaje “La rueda es para un vehículo
 *  mediano”. Si no se cumplen ninguna de las condiciones anteriores debe
 *  mostrarse por pantalla el mensaje “La rueda es para un vehículo pequeño”.
 *  b) Si el diámetro es superior a 1.4 con un grosor inferior a 0.4, ó si el
 *  diámetro es menor o igual a 1.4 pero mayor que 0.8, con un grosor inferior
 *  a 0.25, deberá mostrarse por consola el mensaje “El grosor para esta rueda
 *  es inferior al recomendado”.
 ***************************************/
 import java.util.Scanner;
 public class Problema5{
     public static void main(String[] args) {
         //Declaracion de variables
         Scanner lectura = new Scanner(System.in);
         double grosor, diametro;

         System.out.println("Escribe el valor del grosor de la rueda.");
         grosor=lectura.nextDouble();
         System.out.println("Escribe el valor del diametro de la rueda.");
         diametro=lectura.nextDouble();

         if (diametro>1.4){
             System.out.println("La rueda es para un vehiculo grande.");
         }
         else if (diametro<=1.4 && diametro > 0.8){
             System.out.println("La rueda es para un vehiculo mediano.");
         }
         else{
             System.out.println("La rueda es para un vehiculo chico.");
         }
         if ((diametro>1.4 && grosor<0.4) || ((diametro<=1.4 && diametro>0.8) && grosor<0.25)){
             System.out.println("El grosor para esta rueda es inferior al recomendado.");
         }//cierre de if
     }//cierre del main
 }//cierre de la clase