package day29collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {

        Queue<String> depo = new LinkedList<>();
        depo.add("Egg");
        depo.add("Milk");
        depo.add("Cheese");
        depo.add("Meat");
        System.out.println(depo);//[Egg, Milk, Cheese, Meat]

        depo.remove();
        System.out.println(depo);//[Milk, Cheese, Meat]

        System.out.println(depo.peek());//Milk
        System.out.println(depo.poll());
        System.out.println(depo);//[Cheese, Meat]
        System.out.println(depo.element());//Cheese

        depo.clear();
        System.out.println(depo.poll());//null
       // System.out.println(depo.remove());//exception
      //  System.out.println(depo.element());//exception
        System.out.println(depo.peek());//null

    }
}
