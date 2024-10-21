
package Homework6;

import Homework6.copiesOfLaptops.LaptopForce;
import Homework6.copiesOfLaptops.LaptopLite;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        LaptopForce laptop1 = new LaptopForce(100000.50, "white", "win", 4);

        LaptopForce laptop2 = new LaptopForce(400000.150, "white", "lin", 8);

        LaptopLite laptop3 = new LaptopLite(20000.50, "black", "win", ещё не написано);

        System.err.println(laptop1.getLaptopType());
        System.err.println(laptop3.getLaptopType());
        Set<Laptop> laptops = new HashSet<>();

        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);

        System.out.println(laptops);

    }

}
