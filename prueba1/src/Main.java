import java.util.Scanner;


public class Main {

        public static int[] calcularFibonacci(int n) {
            int[] fibSeries = new int[n];
            if (n >= 1) {
                fibSeries[0] = 0;
            }
            if (n >= 2) {
                fibSeries[1] = 1;
            }
            for (int i = 2; i < n; i++) {
                fibSeries[i] = fibSeries[i - 1] + fibSeries[i - 2];
            }
            return fibSeries;
        }


    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println("Introduce un numero primo \n");
        Scanner texto = new Scanner(System.in);
        int numero1=texto.nextInt();
        System.out.println("Introduce otro \n");
        Scanner texto2 = new Scanner(System.in);
        int numero2=texto2.nextInt();
        if(esPrimo(numero1)==true){
            System.out.println("numero 1 es primo \n");
        }else{
            System.out.println("numero 1 no es primo \n");
        }
        if(esPrimo(numero2)==true){
            System.out.println("numero 2 es primo \n");
        }else{
            System.out.println("numero 2 no es primo \n");
        }
        int n = 10; // Cambia este valor al número de términos que deseas calcular
        int[] resultado = calcularFibonacci(n);

        System.out.println("Serie de Fibonacci con " + n + " términos:");
        for (int i : resultado) {
            System.out.print(i + " ");
        }

    }
}

