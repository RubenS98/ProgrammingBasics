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

/*
C:\Users\thepo\Desktop\Programacion>java TablaMult
T       0       1       2       3       4       5       6       7       8       9       10      11
0       0       0       0       0       0       0       0       0       0       0       0       0
1       0       1       2       3       4       5       6       7       8       9       10      11
2       0       2       4       6       8       10      12      14      16      18      20      22
3       0       3       6       9       12      15      18      21      24      27      30      33
4       0       4       8       12      16      20      24      28      32      36      40      44
5       0       5       10      15      20      25      30      35      40      45      50      55
6       0       6       12      18      24      30      36      42      48      54      60      66
7       0       7       14      21      28      35      42      49      56      63      70      77
8       0       8       16      24      32      40      48      56      64      72      80      88
9       0       9       18      27      36      45      54      63      72      81      90      99
10      0       10      20      30      40      50      60      70      80      90      100     110
11      0       11      22      33      44      55      66      77      88      99      110     121
*/