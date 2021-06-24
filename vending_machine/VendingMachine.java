package Vending_machine;

import Vending_machine.models.Coke;
import Vending_machine.models.Fanta;
import Vending_machine.models.Product;
import Vending_machine.models.Sprite;
import Vending_machine.util.Command;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.*;

public class VendingMachine implements Serializable {
    HashMap<String, List<Queue<Product>>> map = new HashMap<>();
    String [] names={"Coke", "Fanta", "Sprite"};

    public VendingMachine() {
        List<Queue<Product>> listA = new LinkedList<>();
        Queue<Product> q1 = new LinkedList<>();
        refill(q1, "Coke");
        listA.add(q1);
        Queue<Product> q2 = new LinkedList<>();
        refill(q2, "Fanta");
        listA.add(q2);
        Queue<Product> q3 = new LinkedList<>();
        refill(q3, "Sprite");
        listA.add(q3);
        map.put("A", listA);

//    List<Queue<Product>> listB = new LinkedList<>();
//        Queue<Product> q4 = new LinkedList<>();
//        refill(q1, "Coke");
//        listA.add(q1);
//        Queue<Product> q5 = new LinkedList<>();
//        refill(q2, "Fanta");
//        listA.add(q2);
//        Queue<Product> q6 = new LinkedList<>();
//        refill(q3, "Sprite");
//        listA.add(q3);
//        map.put("B", listB);
//
        List<Queue<Product>> listB = new LinkedList<>();
        map.put("B", listB);
        List<Queue<Product>> listC = new LinkedList<>();
        map.put("C", listC);



    }


    public static <T> void refill(Queue queue, String str) {
            int size = queue.size();
            for (int i = 0; i < 10-size; i++) {
                switch (str) {
                    case "Coke":
                        queue.add(new Coke());
                        break;
                    case "Fanta":
                        queue.add(new Fanta());
                        break;
                    case "Sprite":
                        queue.add(new Sprite());
                        break;


                }
            }
        }

            public List<Product> start(Command command) {
                List<Product> products = new ArrayList<>();
                Queue<Product> queue = map.get(command.getKey()).get(command.getCol());

                for (int i = 0; i < command.getQuantity(); i++) {
                    Product poll = queue.poll();
                    String name =names[command.getCol()];
                    System.out.println("name =  "  + name);
                    products.add(poll);
                    if(queue.size()<2){
                        refill(queue, name);
                    }
                }
                return products;
            }

}
