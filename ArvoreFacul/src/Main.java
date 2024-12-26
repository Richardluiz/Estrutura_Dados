import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            tree.insert(random.nextInt(100)); // Insere números aleatórios entre 0 e 99
        }


        System.out.print("Pré-ordem: ");
        tree.preorder();
        System.out.print("Em-ordem: ");
        tree.inorder();
        System.out.print("Pós-ordem: ");
        tree.postorder();


        System.out.println("Menor elemento: " + tree.findMin());
        System.out.println("Maior elemento: " + tree.findMax());


    }
}

