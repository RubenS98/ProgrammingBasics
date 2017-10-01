/*
Programa para calcular el promedio de unas calificaciones con un do-while.
Fecha: 02/10/2017
Ruben Sanchez, Carlos Garcia y Daniela Vignau
*/
import java.util.Scanner;
public class T5Problem3d {
    public static void main (String[] args) {
        double i=0;
        double cal;
	      double num=0;
	      double sum=0;
        double res=0.0;
        Scanner lectura=new Scanner(System.in);
        System.out.println("Dame el numero de calificaciones.");
	      num = lectura.nextDouble();

	      do{
              System.out.println("Dame la calificacion numero "+(i+1)+".");
              cal = lectura.nextDouble();
		          sum=sum+cal;
              i++;
	      }while(i<num);
        res = (double)sum/num;
        System.out.println("El promedio de estas "+num+" calificaciones es "+ res);
    }
}
/*
C:\Users\thepo\OneDrive\Documentos\Programacion>java T5Problem3d
Dame el numero de calificaciones.
4
Dame la calificacion numero 1.0.
89
Dame la calificacion numero 2.0.
76
Dame la calificacion numero 3.0.
96
Dame la calificacion numero 4.0.
96
El promedio de estas 4.0 calificaciones es 89.25
*/
