/*
Programa para calcular el factorial de un numero con un do-while.
Fecha: 02/10/2017
Ruben Sanchez, Daniela Vignau y Carlos Garcia
*/
import java.util.Scanner;
public class T5Problem2d {
    public static void main(String[] args) {
	int i=1;
	int fact=1;
	int num;
	Scanner lectura=new Scanner(System.in);

	System.out.println("Escribe un numero.");
	num = lectura.nextInt();
	
	do{
		fact=fact*+i;
		i++;
	}while(i<=num);
	System.out.println("El factorial de "+num+ " es "+ fact);
    }
}

/*
C:\Users\thepo\OneDrive\Documentos\Programacion>java T5Problem2d
Escribe un numero.
6
El factorial de 6 es 720
*/