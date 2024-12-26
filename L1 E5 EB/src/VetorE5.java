import java.util.Scanner;
public class VetorE5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int valor = scanner.nextInt();

        long fibonacci = calcularFibonacci(valor);
        System.out.println("O número de Fibonacci correspondente a " + valor + "é: "+fibonacci);
    }
    public static long calcularFibonacci(int n){
        if (n <= 1){
            return n;
        } else {
            return calcularFibonacci(n - 1 )+ calcularFibonacci(n - 2);
        }
    }

}
