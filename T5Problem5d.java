/*
Programa para calcular pi con un do-while.
Fecha: 05/10/2017
Ruben Sanchez, Carlos Garcia y Daniela Vignau
*/
import java.util.Scanner;
public class T5Problem5d {
    public static void main(String[] args) {
	double i=1;
	double res=0, pi;
  int cont=0;
	int num;
	Scanner lectura=new Scanner(System.in);

	System.out.println("Escribe el numero de terminos que quieres usar para calcular pi.");
	num = lectura.nextInt();

	do{
    if(cont%2==0){
      res=res+(1/i);
    }
		else{
      res=res-(1/i);
    }
		i=i+2;
    cont++;
	}while(cont<num);
  pi=res*4;
	System.out.println("La aproximacion a pi da "+ pi);
    }
}

/*
C:\Users\thepo\OneDrive\Documentos\Programacion>java T5Problem5d
Escribe el numero de terminos que quieres usar para calcular pi.
4
La aproximacion a pi da 2.8952380952380956
*/
