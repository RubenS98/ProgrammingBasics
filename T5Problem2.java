/*
Programa para calcular el factorial de un numero.
Fecha: 02/10/2017
*/
import java.util.Scanner;
public class T5Problem2 {
    public static void main(String[] args) {
        int i=0;
	int fact=0;
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

*/