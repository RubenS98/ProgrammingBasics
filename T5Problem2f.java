/*
Programa para calcular el factorial de un numero con un for.
Fecha: 02/10/2017
Ruben Sanchez, Daniela Vignau y Carlos Garcia
*/
import java.util.Scanner;
public class T5Problem2f {
    public static void main(String[] args) {
        int i;
	int fact=1;
	int num;
	Scanner lectura=new Scanner(System.in);

	System.out.println("Escribe un numero.");
	num = lectura.nextInt();
	
	for(i=1; i<=num; i++){
		fact=fact*+i;
	}
	System.out.println("El factorial de "+num+ " es "+ fact);
    }
}

/*
C:\Users\thepo\OneDrive\Documentos\Programacion>java T5Problem2f
Escribe un numero.
5
El factorial de 5 es 120
*/