/*Programa que crea una tabla de multiplicacion.
Ruben Sanchez
Fecha: 18/09/2017
 */
import java.util.Scanner;
public class TablaMult {
    public static void main(String[] args) {
        int i;
        int j=0;
        
        for(i=-1; i<=11; i++){
            if(i==-1 && j==0){
                System.out.print("T\t");
            }
            else{
            System.out.print(i+"\t");
            }
            for(j=0; j<=11; j++){
                if(i==-1){
                    System.out.print(j+"\t");
                }
                else{
                    System.out.print((j*i)+"\t");
                }
            }
            System.out.println("");
        }
    }
}
