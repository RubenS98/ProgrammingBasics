/*
Programa para escribir filas de series de numeros hasta el numero indicado por el usuario usando un do-while.
Fecha: 05/10/2017
Ruben Sanchez, Carlos Garcia y Daniela Vignau
*/
import java.util.Scanner;
public class T5Problem4d {
    public static void main(String[] args) {
	     int i=1;
	     int cont=1;
	     int num;
	     Scanner lectura=new Scanner(System.in);

	     System.out.println("Escribe un numero.");
	     num = lectura.nextInt();

	     do{
         do{
           System.out.print(i);
           i++;
         }while(i<=cont);

         System.out.println();
		     cont++;
         i=1;
	     }while(cont<num);

       do{
         do{
           System.out.print(i);
           i++;
         }while(i<=cont);

         System.out.println();
		     cont--;
         i=1;
	     }while(cont>0);
    }
}

/*
C:\Users\thepo\OneDrive\Documentos\Programacion>java T5Problem4d
Escribe un numero.
5
1
12
123
1234
12345
1234
123
12
1
*/
