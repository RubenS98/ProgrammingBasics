/*
Programa para calcular la suma de los numeros del 1 al 50 con un do-while.
Fecha: 05/10/2017
Ruben Sanchez, Carlos Garcia y Daniela Vignau
*/
public class T5Problem1d {
    public static void main (String[] args) {
        int i=0;
	      int cont=0;
	      int sum=0;
	      do{
		          sum=sum+i;
              i++;
	      }while(i<=50);
        System.out.println("La suma de los numeros del 1 al 50 es "+ sum);
    }
}
/*
C:\Users\thepo\OneDrive\Documentos\Programacion>java T5Problem1d
La suma de los numeros del 1 al 50 es 1275
*/
