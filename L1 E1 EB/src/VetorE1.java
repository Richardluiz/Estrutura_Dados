import java.util.Scanner;
public class VetorE1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[10];

        //Recebendo 10 valores do usuário
        System.out.println("Digite 10 números inteiros: ");
        for (int i = 0; i< 10; i++){
            vetor[i] = entrada.nextInt();
        }

        // Imprimindo os valores pares
        System.out.println("\nNúmeros pares:");
        for (int i = 0; i < 10; i++){
            if (vetor[i] % 2 == 0){
                System.out.println(vetor[i]+ " ");
            }
        }
        // Imprimindo os valores ímpares
        System.out.println("\n\nNúmeros ímpares: ");
        for (int i = 0; i < 10; i++){
            if (vetor[i] % 2 != 0){
                System.out.println(vetor[i] + " ");
            }
        }
        entrada.close();

    }

}
