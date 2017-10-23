import java.util.Scanner;
public class EjRecursiva2
{
 public static void main(String[] args)
{
  Scanner stdIn = new Scanner(System.in);
  int n,i;
  System.out.println("Ingresa el numero inicial");
  i = stdIn.nextInt();
  System.out.println("Ingresa el numero final");
  n = stdIn.nextInt();
  conteo(n);
}
  public static void conteo(int num)
  {
    if(num<=0)
      return;
    else
    {
      System.out.printf("%d ",num);
      conteo(num-1);
      System.out.printf("%d ",num);
      return;
    }
  }
}
