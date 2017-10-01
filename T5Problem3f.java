/*
Programa para calcular el promedio de unas calificaciones con un for.
Fecha: 02/10/2017
Ruben Sanchez, Carlos Garcia y Daniela Vignau
*/
import java.util.Scanner;
public class T5Problem3f {
    public static void main (String[] args) {
        double i=0;
        double cal;
	      double num=0;
	      double sum=0;
        double res=0.0;
        Scanner lectura=new Scanner(System.in);
        System.out.println("Dame el numero de calificaciones.");
	      num = lectura.nextDouble();

	      for(i=0; i<num; i++){
              System.out.println("Dame la calificacion numero "+(i+1)+".");
              cal = lectura.nextDouble();
		          sum=sum+cal;
	      }
        res = (double)sum/num;
        System.out.println("El promedio de estas "+num+" calificaciones es "+ res);
    }
}
/*
C:\Users\thepo\OneDrive\Documentos\Programacion>java T5Problem3f
Dame el numero de calificaciones.
5
Dame la calificacion numero 1.0.
98
Dame la calificacion numero 2.0.
70
Dame la calificacion numero 3.0.
83
Dame la calificacion numero 4.0.
100
Dame la calificacion numero 5.0.
97
El promedio de estas 5.0 calificaciones es 89.6
*/
