import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> carros = new LinkedList<>();

        carros.add("HRV");
        carros.add("Golf");
        carros.add("Polo");
        carros.add("Camaro");
        carros.add("Tiggo 3X");

        //System.out.println("Topo da fila: "+ carros.peek());
        System.out.println("Topo da fila: " + carros.poll());
        System.out.println(carros);
        System.out.println(carros.isEmpty()?"Fila vazia":"Fila com elementos");
    }
}
