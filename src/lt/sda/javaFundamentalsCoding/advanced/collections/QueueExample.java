package lt.sda.javaFundamentalsCoding.advanced.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> pokemons = new PriorityQueue<>();

        //offer ideda i queue
        pokemons.offer("Charmander");
        pokemons.offer("Pikachu");

        System.out.println(pokemons.peek());
        System.out.println(pokemons.poll());
        System.out.println(pokemons.peek());

    }
}
