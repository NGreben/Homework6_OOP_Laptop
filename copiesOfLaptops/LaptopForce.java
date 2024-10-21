package copiesOfLaptops;

import Homework6.Laptop;

import java.time.LocalDateTime;

public class LaptopForce extends Laptop {
    public int core;

    public Laptop1( double price, String color, String os, int core) {
        super(price, color, os);
        this.core = core;
    }

    @Override
    public String getLaptopType() {
        return getClass().getSimpleName();
    }
}
