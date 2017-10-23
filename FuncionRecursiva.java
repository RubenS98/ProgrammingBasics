public class FuncionRecursiva{
	public static void main(String[] args){
		// calculo de sumatoria hasta n
		// 1 + 2 + 3 + ...
		int n = 7;
		System.out.format("Sumatoria: %d", sumatoria(n));
		System.out.format("\nSuma recursiva: %d", sumatoriaRecursiva(n));
		System.out.format("\nFactorial: %d", factorial(n));
		System.out.format("\nFibonacci: %d", fibonacci(n));

	}//cierre main

	public static int sumatoria(int n){
		int suma = 0;
		for(int cont = 1; cont<=n; cont++){
			suma+=cont;
		}//cierre for
		return(suma);
	}//cierre sumatoria

	public static int sumatoriaRecursiva(int n){
		if(n==1)
			return 1;
		else
			return n+sumatoriaRecursiva(n-1);
	}//cierre sumatoriaRecursiva

	public static long factorial(long n){
		if(n<=1)
			return 1;
		else
			return n*factorial(n-1);
	}//cierre factorial

	public static int fibonacci(int n){
		if(n<=1)
			return n;
		else
			for(int cont = 1; cont<=n; cont++){
				System.out.println();
			}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}//cierre fib

}//cierre class
